package com.ironhack.BankingAccount.Entities.Users;

import java.time.LocalDate;
import java.util.Date;

public class AccountHolder extends User{


    private final LocalDate DateOfBirth = LocalDate.now();



    //TODO private int Age = DateofBirth - LocalDate (.year?)

    //primaryAdress should be a separate adress class?
    private String primaryAdress;
    // mailing Address is optional
    private String mailingAdress;

    /*
    * @one to many (mappedby primaryOwner
    * privateList account primaryaccount = new ArrayList
    * by anna( veure si implementar, es per tenir la llsita de comptes vinculata a unic user)
    *
    * */

    public AccountHolder(String name, String primaryAdress, String mailingAdress) {
        super(name);
        this.primaryAdress = primaryAdress;
        this.mailingAdress = mailingAdress;
    }

    public AccountHolder() {
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public String getPrimaryAdress() {
        return primaryAdress;
    }

    public void setPrimaryAdress(String primaryAdress) {
        this.primaryAdress = primaryAdress;
    }

    public String getMailingAdress() {
        return mailingAdress;
    }

    public void setMailingAdress(String mailingAdress) {
        this.mailingAdress = mailingAdress;
    }

    /*
    AccountHolders should be able to access their own account balance
    (login and display accounts )?

    method transferMoney{
    originAccount Owner // propietario de la cuenta debe coincidir con el propietario vinculado a la id de la cuenta
    originAccount id   //id de la cuenta de origen solo aplicable a las cuentas vinculada al user

    destinyAccount Owner //propietario de la cuenta destino, debe coincidir con el id. puede ser o 1r or 2n
    destinyAccount id  // id de la cuenta de destino,
    amount // cantidad a enviar (posibilidad de poner un String como concepto?

    1rcondició originAcc.balance-account != negative int? ok
    if not -> throw exception "the transaction cannot be carried out, not enough funds"
//mirar de enviar un mensaje de adventencia en caso de que la cantidad restante vaya a quedar por debajo del "minimum amount"?
    originAccount.balance - amount = new originAccount.balance



Account holders should be able to transfer money from any of their
 accounts to any other account (regardless of owner). The transfer
 should only be processed if the account has sufficient funds.
 The user must provide the Primary or Secondary owner’s name and
 the id of the account that should receive the transfer.


TODO terminal for AccountHolders:
>access account [display info] > controler a revisar
>transfer money> controler a revisar




     */





}
