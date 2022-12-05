package com.ironhack.BankingAccount.Repositories;

import com.ironhack.BankingAccount.Entities.Account.Checking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

// TODO no es un repository de users si no del checking
public interface RepositoryUser extends JpaRepository<Checking, Long>{

    //CRUD


}
