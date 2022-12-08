package com.ironhack.BankingAccount.Entities.Users;

import jakarta.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;


    //se q no es lo habitual, pero como dejar la puerta abierta? podria llegar a modificarlo el admin?
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
