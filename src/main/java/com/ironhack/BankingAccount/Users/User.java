package com.ironhack.BankingAccount.Users;

public abstract class User {
    private String Name;

    public User(String name) {
        Name = name;
    }

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
