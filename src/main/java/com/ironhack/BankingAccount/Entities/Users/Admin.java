package com.ironhack.BankingAccount.Entities.Users;

public class Admin extends User {


 public Admin(String name) {
  super(name);
 }


}


/*
TODO metodo createAccount
switch bw Checking / Savings / CreditCard
if option Checking & (primaryOwner.Age < 24) get StudentCheckingConstructor,
else get CheckingConstructor



Admins should be able to access the balance for any account and to modify it.

need id of the account i want to change
access by account && access by user? (search by users (display accounts of the selected) or
(search by account id)


TODO Admin must add Third-party Users

TODO find a way to get some display of changes in balance


terminal for admin:

-createAccounts
-Add 3roartyUser to database
-Access accounts > modify balance










 */