package dev.sekousow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public class AccountRepository {

    private final ConcurrentHashMap<String, Account> accounts = new ConcurrentHashMap<>();

    Account account1 = new Account(
            "BNDA-ACC001",
            "ML147ML00123456",
            Account.AccountType.SAVINGS_ACCOUNT,
            "XOF",
            520_000.0,
            0.0,
            LocalDateTime.now()
    );

    Account account2 = new Account(
            "BNDA-ACC002",
            "ML147ML00987654",
            Account.AccountType.CURRENT_ACCOUNT,
            "XOF",
            95_000.0,
            75_000.0,
            LocalDateTime.now()
    );

    Account account3 = new Account(
            "BNDA-ACC003",
            "ML147ML44556677",
            Account.AccountType.SAVINGS_ACCOUNT,
            "XOF",
            1_800_000.0,
            0.0,
            LocalDateTime.now()
    );

    Account account4 = new Account(
            "BNDA-ACC004",
            "ML147ML77889900",
            Account.AccountType.CURRENT_ACCOUNT,
            "XOF",
            32_000.0,
            50_000.0,
            LocalDateTime.now()
    );

    Account account5 = new Account(
            "BNDA-ACC005",
            "ML147ML22334455",
            Account.AccountType.SAVINGS_ACCOUNT,
            "XOF",
            640_000.0,
            0.0,
            LocalDateTime.now()
    );

    public AccountRepository() {
        accounts.put(account1.code(), account1);
        accounts.put(account2.code(), account2);
        accounts.put(account3.code(), account3);
        accounts.put(account4.code(), account4);
        accounts.put(account5.code(), account5);
    }

    public Account findByCode(String code) {
        return accounts.get(code);
    }

    public Account findByAccountNumber(String accountNumber) {
        return accounts.values()
                .stream()
                .filter(account -> account.accountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }

    public List<Account> findAll() {
        return new ArrayList<>(accounts.values());
    }

    public Account createAccount(Account account) {
        accounts.putIfAbsent(account.code(), account);
        return account;
    }
}
