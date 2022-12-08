package com.ironhack.BankingAccount;

import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import com.ironhack.BankingAccount.Repositories.RepoUsers.RepoAccountHolder;
import com.ironhack.BankingAccount.Services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAcoountNurApplication implements CommandLineRunner{
	@Autowired
	RepoAccountHolder user1;

	public static void main(String[] args) {
		SpringApplication.run(BankingAcoountNurApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		user1.save(new AccountHolder());
	}









/* TODO pending:
>validaciones bien de cada uno de los elementos > hecho, pedir revision para q todo OK
>revisar logicas (de validación + metodos)
>mirar como funcionan los testeos para incorporados >FAIL
>repositorios

==miercoles ==
>funcionalidades
>transferencias/creacion de cuentas/accesos y modificacion de balance

==JUEVES==
terminar funcionalidades
implementar seguridad

 */



	}

