package dev.sekousow;

import java.time.LocalDateTime;

/**
 * @author Sékou Sallah Sow <sowsekou@hotmail.com>
 */
public record Account(
        String code,
        String accountNumber,
        AccountType accountType,
        String currency,
        Double balance,
        Double overdraftLimit,
        LocalDateTime createdAt

) {
    public enum AccountType {
        SAVINGS_ACCOUNT, CURRENT_ACCOUNT
    }
}
