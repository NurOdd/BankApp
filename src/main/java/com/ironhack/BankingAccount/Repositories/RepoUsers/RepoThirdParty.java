package com.ironhack.BankingAccount.Repositories.RepoUsers;

import com.ironhack.BankingAccount.Entities.Users.ThirdParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoThirdParty extends JpaRepository<ThirdParty, Long> {


}
