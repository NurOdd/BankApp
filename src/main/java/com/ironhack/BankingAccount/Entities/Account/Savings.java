package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Entity
public class Savings extends Account{

    private BigDecimal minimumBalance = new BigDecimal( 1000);
    private BigDecimal interestRate = new BigDecimal(0.0025);

    public Savings(BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey, BigDecimal minimumBalance, BigDecimal interestRate) {
        super(balance, primaryOwner, secondaryOwner, penaltyFee, secretKey);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

          public Savings() {

    }

    public void setMinimumBalance(BigDecimal minimumBalance) {

        this.minimumBalance = minimumBalance;

    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;

    }


    /*TODO interest rate max =< 0.5
    TODO balance must be min !< 100 =< 1000

Interest on savings accounts is added to the
 account annually at the rate of specified interestRate per year.
  That means that if I have 1000000 in a savings account with a ¿0.01 interest rate,
  1%? of 1 Million is added to my account after 1 year. When a savings account
  balance is accessed, you must determine if it has been 1 year or more since
   either the account was created or ¿|since interest was added to the account|?,
   and add the appropriate interest to the balance if necessary.

esto es para metodo ApplyInterestSavings:
1ra condicion: LocalDate dd/mm/yyyy + 1y =< true
if (1rC = true) {
interestRate*balance= interestGenerated;  interestGenerated+balance = new balance


    */


}

