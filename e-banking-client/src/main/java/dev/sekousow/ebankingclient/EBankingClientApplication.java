package dev.sekousow.ebankingclient;

import dev.sekousow.ebankingclient.proxy.Account;
import dev.sekousow.ebankingclient.proxy.AccountService;
import dev.sekousow.ebankingclient.proxy.AccountType;
import dev.sekousow.ebankingclient.proxy.BankAccountService;

import java.util.List;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public class EBankingClientApplication {

    public static void main(String[] args) {

        AccountService accountServicePort = new BankAccountService().getAccountServicePort();
        List<Account> accounts = accountServicePort.getAllAccounts();
        accounts.forEach(System.out::println);

        Double convertedAmount = accountServicePort.convertEuroToDirham(100.0);
        System.out.println("Converted Amount: " + convertedAmount);

        Account account = new Account();

        account.setBalance(convertedAmount);
        account.setCurrency("XOF");
        account.setAccountNumber("ML147ML28018821");
        account.setCode("BCI0010");
        account.setAccountType(AccountType.SAVINGS_ACCOUNT);
        account.setOverdraftLimit(0.0);
        account.setCreatedAt(null);

        System.out.println("Created account: " + accountServicePort.createAccount(account));

    }
}
