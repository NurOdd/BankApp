package com.ironhack.BankingAccount.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Checking  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int balance;
    private int SecretKey;
    private String PrimaryOwner;
    private String SecondaryOwner;
    private int minimumBalance;
    private int penaltyFee;
    private int monthlyMaintanceFee;
    private int creationDate;
    private Status status;

    private List<Checking> checking;

}
