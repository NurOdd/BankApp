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
}