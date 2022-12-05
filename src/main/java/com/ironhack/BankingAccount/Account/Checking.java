package com.ironhack.BankingAccount.Account;

import jakarta.persistence.Entity;

@Entity

public class Checking {
    private long id;
    private int balance;
    private int SecretKey;
    private String PrimaryOwner;
    private String SecondaryOwner;
    private int minimumBalance;
    private int penaltyFee;
    private int monthlyMaintanceFee;
    private int creationDate;
    private Status status;


}
