package com.ironhack.BankingAcoount;

import com.ironhack.BankingAccount.Entities.Users.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankingAcoountNurApplicationTests {


	@Autowired


	@Test
	void createAdmin() {
		Admin admin = new Admin("asd")
	}

}
