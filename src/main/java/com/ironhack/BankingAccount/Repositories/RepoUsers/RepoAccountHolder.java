package com.ironhack.BankingAccount.Repositories.RepoUsers;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAccountHolder extends JpaRepository<AccountHolder, Long> {




}
