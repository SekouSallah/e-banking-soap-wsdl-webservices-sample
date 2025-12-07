package dev.sekousow;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
@WebService(serviceName = "BankAccountService", targetNamespace = "http://sekousow.dev/ebanking")
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @WebMethod(operationName = "ConvertEuroToDirham")
    public Double convertEuroToDirham(@WebParam(name = "amount") Double amount) {
        return amount * 11;
    }

    @WebMethod(operationName = "CreateAccount")
    public Account createAccount(@WebParam(name = "account") Account account) {
        return accountRepository.createAccount(account);
    }

    @WebMethod(operationName = "GetAllAccounts")
    public List<Account> findAll() {
        var accounts = accountRepository.findAll();
        accounts.forEach(System.out::println);
        return accounts;
    }
}
