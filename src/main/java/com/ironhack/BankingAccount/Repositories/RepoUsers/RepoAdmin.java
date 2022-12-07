package com.ironhack.BankingAccount.Repositories.RepoUsers;

import com.ironhack.BankingAccount.Entities.Users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAdmin extends JpaRepository<Admin, Long> {
}
