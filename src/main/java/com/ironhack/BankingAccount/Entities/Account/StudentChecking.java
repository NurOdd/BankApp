package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class StudentChecking extends Account {

    public StudentChecking(BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey) {
        super(balance, primaryOwner, secondaryOwner, penaltyFee, secretKey);
    }

    public StudentChecking() {
    }

    public StudentChecking(BigDecimal balance, String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner) {
    }
}
