package com.ironhack.BankingAccount.Services;


import com.ironhack.BankingAccount.Entities.Account.Account;
import com.ironhack.BankingAccount.Entities.Account.Checking;
import com.ironhack.BankingAccount.Entities.Account.StudentChecking;
import com.ironhack.BankingAccount.Methods.Repositories.RepoAccounts.RepoAccount;
import com.ironhack.BankingAccount.Methods.Repositories.RepoUsers.RepoAccountHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AdminService {

    @Autowired
    RepoAccountHolder repoAccountHolder;


    @Autowired
    RepoAccount repoAccount;

//TODO modificar el checking y los pedidos


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


    public Account createCreditCard(Account account, Long userId) {
        return null;
    }


    public Account createThirdParty(Account account, Long userId) {
        return null;
    }
    }
