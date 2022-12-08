package com.ironhack.BankingAccount.Methods.Repositories.RepoAccounts;

import com.ironhack.BankingAccount.Entities.Account.Savings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSavings extends JpaRepository<Savings, Long> {


}
