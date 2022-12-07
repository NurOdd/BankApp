package com.ironhack.BankingAccount.Repositories.RepoAccounts;

import com.ironhack.BankingAccount.Entities.Account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAccount extends JpaRepository<Account, Long> {


}
