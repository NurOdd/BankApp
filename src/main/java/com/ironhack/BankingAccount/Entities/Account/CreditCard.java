package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.Entity;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@Entity
public class CreditCard extends Account {

    private BigDecimal creditLimit= new BigDecimal(100);
    private BigDecimal interestRate = new BigDecimal(0.2);

    public CreditCard(BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey, BigDecimal creditLimit, BigDecimal interestRate) {
        super(balance, primaryOwner, secondaryOwner, penaltyFee, secretKey);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    public CreditCard() {
    }

//TODO creditLimit  100 =<>= 100000
    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


//TODO interestRate 0.1=<>=0.2
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }


}