package com.ironhack.BankingAccount.Account;

public class CreditCard {
    // el id en principio no es necesario, pero de alguna manera se tiene que identificar la tarjeta en el sistema no? que decir, se pueden tener más de una cuenta¿
    private long id;
    private int balance;
    //¿Emplear SecretKey como sistema de seguridad para la tarjeta?
    // private int SecretKey;


    private String PrimaryOwner;
    private String SecondaryOwner;
    private int creditLimit;
    private int interestRate;
    private int penaltyFee;
    //¿Usar Status para definir si la tarjeta está activada, congelado a bloqueada?
        private Status status;
}
