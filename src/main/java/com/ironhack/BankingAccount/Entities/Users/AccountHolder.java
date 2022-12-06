package com.ironhack.BankingAccount.Entities.Users;

import java.util.Date;

public class AccountHolder extends User{


    private final Date DateOfBirth = new Date();

    //primaryAdress should be a separate adress class?
    private String primaryAdress;
    // mailing Address is optional
    private String mailingAdress;


    public AccountHolder(String name, String primaryAdress, String mailingAdress) {
        super(name);
        this.primaryAdress = primaryAdress;
        this.mailingAdress = mailingAdress;
    }

    public AccountHolder() {
    }

    public Date getDateOfBirth() {
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
}
