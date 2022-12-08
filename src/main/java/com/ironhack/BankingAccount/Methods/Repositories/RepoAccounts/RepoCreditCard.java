package com.ironhack.BankingAccount.Methods.Repositories.RepoAccounts;

import com.ironhack.BankingAccount.Entities.Account.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCreditCard extends JpaRepository<CreditCard, Long> {


}
