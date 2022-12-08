package com.ironhack.BankingAccount.Services;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import com.ironhack.BankingAccount.Methods.Repositories.RepoUsers.RepoAccountHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountHolderService {

    @Autowired
    RepoAccountHolder repoAccountHolder;

    public AccountHolder accessAccount (Long userId){

        return repoAccountHolder.findById(userId).get();
    }


}
