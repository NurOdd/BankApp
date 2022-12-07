package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@Entity
public class CreditCard extends Account {


    @DecimalMin(value = "100")
    @DecimalMax(value = "100000")
    private BigDecimal creditLimit;


    @DecimalMin(value = "0.1")
    @DecimalMax(value = "0.2")
    private BigDecimal interestRate;

    public CreditCard(BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey, BigDecimal creditLimit, BigDecimal interestRate) {
        super(balance, primaryOwner, secondaryOwner, penaltyFee, secretKey);
       setCreditLimit(creditLimit);
       setInterestRate(interestRate);
    }

    public CreditCard() {
    }

// creditLimit  100 =<>= 100000
    public void setCreditLimit(BigDecimal creditLimit) {
        if(creditLimit == null) {
            this.creditLimit = new BigDecimal("100");

        }else{

            this.creditLimit = creditLimit;
        }
    }


// interestRate 0.1=<>=0.2
    public void setInterestRate(BigDecimal interestRate) {
        if(interestRate == null){
            this.interestRate = new BigDecimal(0.2);
            return;
        }
        this.interestRate = interestRate;
    }

    /*
    *Interest on credit cards is added to the balance monthly.
    * If you have a 12% interest rate (0.12) then 1% interest will
    *  be added to the account monthly. When the balance of a credit
    * card is accessed, check to determine if it has been 1 month or
    * more since the account was created or since interest was added,
    * and if so, add the appropriate interest to the balance.
    *
    *  TODO ApplyCardInterest method
    *  interestRate / 12 = interestMonthly //  interestMonthly*balance =interestGeneerated
    *  interestGenerated+ balance = new Balance
    *
    *
    */



}