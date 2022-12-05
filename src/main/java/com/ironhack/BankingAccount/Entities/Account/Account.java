package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private BigDecimal balance;

    @ManyToOne
    private AccountHolder primaryOwner;
    //TODO como hacer los opcionales, 2nOwner es opcional> hacerlo en los metodos asegurarse q el segundo no sea null

   @ManyToOne
    private AccountHolder secondaryOwner;
    private int penaltyFee;

    /*Agrego además para facilitar cosas a posteriori
    class creationDate, SecretKey, Status y ID */

    private String secretKey;
    private Status status;
    private LocalDate creationDate;

    public Account(Long id, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, int penaltyFee, String secretKey, Status status, LocalDate creationDate) {
        this.id = id;
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.penaltyFee = penaltyFee;
        this.secretKey = secretKey;
        this.status = status;
        this.creationDate = creationDate;
    }


}
