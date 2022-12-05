package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Savings extends Account{

    private int minimumBalance;
    private int interestRate;


//TODO ¿constructor vacio? = q other accounts
    public Savings(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate, int minimumBalance, int interestRate) {
        super(id, balance, primaryOwner, secondaryOwner, penaltyFee, secretKey, status, creationDate);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
