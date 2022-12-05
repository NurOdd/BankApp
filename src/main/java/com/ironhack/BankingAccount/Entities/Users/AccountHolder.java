package com.ironhack.BankingAccount.Entities.Users;

public class AccountHolder extends User{


    private int DateOfBirth;

    //primaryAdress should be a separate adress class?
    private String primaryAdress;
    // mailing Address is optional
    private String mailingAdress;


    public AccountHolder(String name, int dateOfBirth, String primaryAdress, String mailingAdress) {
        super(name);
        DateOfBirth = dateOfBirth;
        this.primaryAdress = primaryAdress;
        this.mailingAdress = mailingAdress;
    }

    public AccountHolder(){}

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
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
