package com.ironhack.BankingAccount.Repositories.RepoAccounts;

import com.ironhack.BankingAccount.Entities.Account.StudentChecking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoStudentChecking extends JpaRepository<StudentChecking, Long> {


}
