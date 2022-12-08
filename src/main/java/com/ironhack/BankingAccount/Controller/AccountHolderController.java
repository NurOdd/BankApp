package com.ironhack.BankingAccount.Controller;


import com.ironhack.BankingAccount.Entities.Account.Account;
import com.ironhack.BankingAccount.Services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountHolderController {

    @Autowired
    AccountHolderService accountHolderService;


    //Ruta para acceder a las cuentas del usuario

 @PostMapping("/accessAccount")
 @ResponseStatus(HttpStatus.ACCEPTED)
 public Account account(@RequestBody Long userId){
     return null; // TODO display data of account
 }


 //Ruta para transferir
@PostMapping("TransferMoney")
@ResponseStatus(HttpStatus.ACCEPTED)
public Account account(){
     return accountHolderService.transferMoney(accountId, balance);
}

}
