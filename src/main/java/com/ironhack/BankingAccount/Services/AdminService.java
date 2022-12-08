package com.ironhack.BankingAccount.Services;


import com.ironhack.BankingAccount.Entities.Account.*;
import com.ironhack.BankingAccount.Entities.Users.User;
import com.ironhack.BankingAccount.Methods.Repositories.RepoAccounts.RepoAccount;
import com.ironhack.BankingAccount.Methods.Repositories.RepoUsers.RepoAccountHolder;
import com.ironhack.BankingAccount.Methods.Repositories.RepoUsers.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

@Service
public class AdminService {

    @Autowired
    RepoAccountHolder repoAccountHolder;


    @Autowired
    RepoAccount repoAccount;

    @Autowired
    RepoUser repoUser;
//TODO modificar el checking y los pedidos


    //== Metodo para crear cuentas basicas, en caso de que sea >24 crea cuenta estudiante
    public Account createChecking(Checking checking) {

      /* ==la idea primero era la de poder encontrar si el user estaba, por si el user ya tenia una cuenta asociada==
       if(repoAccountHolder.findById(id).isPresent()){
       logica}{else
       throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Id not found");
     AccountHolder user = repoAccountHolder.findById(id).get(); // guarda la variable*/


        Period intervalPeriod = Period.between(checking.getPrimaryOwner().getDateOfBirth(), LocalDate.now());

        if (intervalPeriod.getYears() < 24) {
            StudentChecking studentChecking = new StudentChecking(checking.getBalance(), checking.getSecretKey(), checking.getPrimaryOwner(), checking.getSecondaryOwner());
            repoAccount.save(studentChecking);
            return studentChecking;
        } else {
            // Checking checking = new Checking(checking.getBalance(), checking.getSecretKey(), checking.getPrimaryOwner(), checking.getSecondaryOwner(), checking.getMinimumBalance(), checking.getMonthlyMaintanceFee());
            //user.getPrimaryAccount List().add(checking);

            repoAccount.save(checking);
            return checking;
        }
    }
    //== Metodo para crear cuentas de ahorro
    public Account createSavings(Savings savings) {
        repoAccount.save(savings);
        return savings;
    }

    //== Metodo para crear cuentas de credito
    public Account createCreditCard(CreditCard creditCard) {
        repoAccount.save(creditCard);
        return creditCard;
    }

    //== Metodo para crear usuarios ThirdParty
    public User createThirdParty(User user) {
        repoUser.save(user);
        return null;
    }

    //== Metodo para borrar cuentas (tiene en cuenta si ya no existe)
    public Account deleteAccount(Long accountId) {
        if(repoAccount.findById(accountId).isPresent()){
        repoAccount.deleteById(accountId);
        return null;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This account doesn't exist");
        }
    }


    //saber que vull modificar a l'accoount, setbalance crear ammount
public Account modifyBalance(Account account, Long accountId, BigDecimal balance){
    if(repoAccount.findById(accountId).isPresent()){

     //   setbalance (o sumar/restar o establecer nuevo balance);
        repoAccount.save(account.get);
        return account;
    }
}





}
