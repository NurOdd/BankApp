package com.ironhack.BankingAccount.Repositories.RepoAccounts;

import com.ironhack.BankingAccount.Entities.Account.Checking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoChecking extends JpaRepository<Checking, Long>{


}
