package dev.sekousow;

import jakarta.xml.ws.Endpoint;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public class EBankingApplication {

    public static void main(String[] args) {
        try {
            startWebService();
        } catch (Exception e) {
            System.err.println("Web service failed : " + e);
        }
    }

    private static void startWebService() {
        String url = "http://0.0.0.0:8282/ebanking";
        Endpoint.publish(url, new AccountService(new AccountRepository()));
        System.out.println("Web service started at: " + url);
    }
}
