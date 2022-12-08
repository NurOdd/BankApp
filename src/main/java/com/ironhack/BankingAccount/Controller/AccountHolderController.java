package com.ironhack.BankingAccount.Controller;

import com.ironhack.BankingAccount.Entities.Account.Account;
import com.ironhack.BankingAccount.Entities.Users.AccountHolder;
import com.ironhack.BankingAccount.Services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountHolderController {

    @Autowired
    AccountHolderService accountHolderService;


    //Ruta para acceder a las cuentas del usuario

 @GetMapping("/accessAccount")
 @ResponseStatus(HttpStatus.ACCEPTED)
 public AccountHolder accessAccount(@RequestParam Long userId){

     return accountHolderService.accessAccount(userId);

 }


 //Ruta para transferir
@PostMapping("TransferMoney")
@ResponseStatus(HttpStatus.ACCEPTED)
public Account account(){
     return accountHolderService.transferMoney(accountId, balance);
}

}
