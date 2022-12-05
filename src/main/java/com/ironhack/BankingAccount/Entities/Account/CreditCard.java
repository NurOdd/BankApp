package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;


public class CreditCard extends Account{

    private int creditLimit;
    private int interestRate;


    public CreditCard(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate, int creditLimit, int interestRate) {
        super(id, balance, primaryOwner, secondaryOwner, penaltyFee, secretKey, status, creationDate);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }
//TODO ¿se pueden hacer un constructo vacio sin los elemmentos del super?
    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
