package com.ironhack.BankingAccount.Entities.Users;

public class ThirdParty extends User {
    private String hashedKey;

    public ThirdParty(String name, String hashedKey) {
        super(name);
        this.hashedKey = hashedKey;
    }

    public ThirdParty() {
    }

    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) {
        this.hashedKey = hashedKey;
    }

/*

TODO 3PartyUser access

    There must be a way for third-party users to receive and send money to other accounts.

    Third-party users must be added to the database by an admin.

    In order to receive and send money, Third-Party Users must provide their
    hashed key in the header of the HTTP request. They also must provide the
    amount, the Account id and the account secret key


terminal 3PartyUser:
>Transfer money






*/

}
