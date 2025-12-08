package dev.sekousow.ebankingserver;

import dev.sekousow.ebankingserver.accounts.AccountRepository;
import dev.sekousow.ebankingserver.accounts.AccountService;
import jakarta.xml.ws.Endpoint;

import java.util.Properties;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public class EBankingServerApplication {

    public static void main(String[] args) {
        try {
            startWebService();
        } catch (Exception e) {
            System.err.println("Web service failed : " + e);
        }
    }

    private static void startWebService() {
        String baseUrl = getOrDefaultProperty("server.address", "http://localhost:8082/ws/ebanking");

        Endpoint.publish(baseUrl, new AccountService(new AccountRepository()));
        System.out.println("Web service started at: " + baseUrl);
    }

    private static String getOrDefaultProperty(String key, String defaultValue) {
        Properties properties = new Properties();

        try (var fis = EBankingServerApplication.class.getResourceAsStream("/application.properties")) {
            properties.load(fis);
            return properties.getProperty(key, defaultValue);
        } catch (Exception e) {
            System.err.println("Could not load properties file: " + e.getMessage());
            return defaultValue;
        }
    }
}
