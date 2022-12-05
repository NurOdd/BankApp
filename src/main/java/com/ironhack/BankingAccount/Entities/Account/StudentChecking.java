package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StudentChecking extends Account {
//TODO revisar el constructor
    public StudentChecking(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate) {
        super(id, balance, primaryOwner, secondaryOwner, penaltyFee, secretKey, status, creationDate);
    }




}
