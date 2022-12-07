package com.ironhack.BankingAccount.Entities.Account;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import com.ironhack.BankingAccount.Enum.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
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
    private BigDecimal penaltyFee = new BigDecimal(40) ;

    /*Agrego además para facilitar cosas a posteriori
    class creationDate, SecretKey, Status y ID */

    private String secretKey;
    private Status status = Status.ACTIVE;
    private final LocalDate creationDate = LocalDate.now();

    public Account( BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal penaltyFee, String secretKey) {
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.penaltyFee = penaltyFee;
        this.secretKey = secretKey;

    }

    public Account() {
    }

    // TODO  if (after transactionMethod is used  && balance < minimumBalance) { apply PenaltyFeeMethod)
    // PenaltyfeeMethod ={banlace - penaltyFee == new Balance}



}
