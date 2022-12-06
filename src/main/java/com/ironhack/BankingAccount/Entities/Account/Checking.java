package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;



@Entity
@Data
public class Checking extends Account {

    private BigDecimal minimumBalance = new BigDecimal(250);

    private BigDecimal monthlyMaintanceFee = new BigDecimal(12);


    public Checking(BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey, BigDecimal minimumBalance, BigDecimal monthlyMaintanceFee) {
        super(balance, primaryOwner, secondaryOwner, penaltyFee, secretKey);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintanceFee = monthlyMaintanceFee;
    }

    public Checking() {
    }



}