package com.ironhack.BankingAccount.Methods.Repositories.RepoUsers;

import com.ironhack.BankingAccount.Entities.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepoUser extends JpaRepository<User, Long>{

    //CRUD


}
