package com.ironhack.BankingAccount.Services;


import com.ironhack.BankingAccount.Entities.Account.Account;
import com.ironhack.BankingAccount.Entities.Account.Checking;
import com.ironhack.BankingAccount.Entities.Account.StudentChecking;
import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import com.ironhack.BankingAccount.Repositories.RepoAccounts.RepoAccount;
import com.ironhack.BankingAccount.Repositories.RepoUsers.RepoAccountHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AdminService {

    @Autowired
    RepoAccountHolder repoAccountHolder;

    public Account createChecking(Account account, Long id) {
        if(repoAccountHolder.findById(id).isPresent()){
     AccountHolder user = repoAccountHolder.findById(id).get(); // guarda la variable
        Period intervalPeriod = Period.between(user.getDateOfBirth(), LocalDate.now());

      if (intervalPeriod.getYears() <24){
         StudentChecking studentChecking = new StudentChecking(account.getBalance(),account.getSecretKey(), account.getPrimaryOwner(), account.getSecondaryOwner());
        //user.getPrimaryAccount List().add(checking);
          RepoAccountHolder.save(user);
          RepoAccount.save(studentChecking);
          return studentChecking}
      else{
          StudentChecking studentChecking = new StudentChecking(account.getBalance(),account.getSecretKey(), account.getPrimaryOwner(), account.getSecondaryOwner());
          //user.getPrimaryAccount List().add(checking);
          RepoAccountHolder.save(user);
          RepoAccount.save(studentChecking);
          return studentChecking}
else {
    Checking checking = new Checking(account.getBalance(),account.getSecretKey(), checking);
}

return null;
    }
}

    public Account createCreditCard(Account account, Long userId) {
    }

    public Account createThirdParty(Account account, Long userId) {
    }
