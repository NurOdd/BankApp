package com.ironhack.BankingAccount.Entities.Users;

public class Admin extends User {


 public Admin(String name) {
  super(name);
 }


}


/*
TODO metodo createAccount
switch bw Checking / Savings / CreditCard

crear 3 rutas distintas
if option Checking & (primaryOwner.Age < 24) get StudentCheckingConstructor,
else get CheckingConstructor



Admins should be able to access the balance for any account and to modify it.

need id of the account i want to change
access by account && access by user? (search by users (display accounts of the selected) or
(search by account id)




TODO find a way to get some display of changes in balance


TODO terminal for admin:

-createAccounts (3 routes) >done
-Add 3roPartyUser to database> controler done, falta logic
-Access accounts > modify balance
-delete accounts>










 */