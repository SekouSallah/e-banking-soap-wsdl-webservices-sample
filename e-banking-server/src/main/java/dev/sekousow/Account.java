package dev.sekousow;

import java.util.Date;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public class Account {

    private String code;

    private String accountNumber;

    private AccountType accountType;

    private String currency;

    private double balance;

    private double overdraftLimit;

    private Date createdAt;

    public Account() {
    }


    public Account(
            String code,
            String accountNumber,
            AccountType accountType,
            String currency,
            double balance,
            double overdraftLimit,
            Date createdAt
    ) {
        this.code = code;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currency = currency;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.createdAt = createdAt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "code='" + code + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType=" + accountType +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                ", createdAt=" + createdAt +
                '}';
    }

    public enum AccountType {
        SAVINGS_ACCOUNT,
        CURRENT_ACCOUNT
    }
}
