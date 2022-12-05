package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


//TODO ¿Seria tambien un Entity?
public class Checking extends Account {

    private int minimumBalance;

    private int monthlyMaintanceFee;

//TODO ¿Se puede hacer constructo vacio sin el super? mismo q resto de cuentas
    public Checking(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate) {
        super(id, balance, primaryOwner, secondaryOwner, penaltyFee, secretKey, status, creationDate);
    }

    public Checking(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate, int minimumBalance, int monthlyMaintanceFee) {
        super(id, balance, primaryOwner, secondaryOwner, penaltyFee, secretKey, status, creationDate);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintanceFee = monthlyMaintanceFee;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getMonthlyMaintanceFee() {
        return monthlyMaintanceFee;
    }

    public void setMonthlyMaintanceFee(int monthlyMaintanceFee) {
        this.monthlyMaintanceFee = monthlyMaintanceFee;
    }
}
