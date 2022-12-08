package com.ironhack.BankingAccount.Controller;



import com.ironhack.BankingAccount.Entities.Account.Account;
import com.ironhack.BankingAccount.Entities.Account.Checking;
import com.ironhack.BankingAccount.Entities.Account.CreditCard;
import com.ironhack.BankingAccount.Entities.Account.Savings;
import com.ironhack.BankingAccount.Entities.Users.User;
import com.ironhack.BankingAccount.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;


    //Ruta para poder crear la cuenta Checking/StudentChecking
    @PostMapping("/createChecking")
    @ResponseStatus(HttpStatus.CREATED)
    //TODO del @RequestBody tienen que ser todos los parametros necesarios?
    public Account createChecking(@RequestBody Checking checking) {
return adminService.createChecking(checking);
    }


    //Ruta para poder crear la cuenta Savings
    @PostMapping("/createSavings")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createSavings(@RequestBody Savings savings){
        return adminService.createSavings(savings);
    }

    //Ruta para poder crear la cuenta CreditCard
@PostMapping("/createCreditCard")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createCreditCard(@RequestBody CreditCard creditCard){
        return adminService.createCreditCard(creditCard);
}

    //Ruta para poder crear la cuenta thirdParty
    @PostMapping("/createThirdParty")
    @ResponseStatus(HttpStatus.CREATED)
    public User createThirdParty(@RequestBody User user){
        return adminService.createThirdParty(user);
    }

    //Ruta para destruir Account (agregado opcion en caso de que dicha cuenta no exista)
    @PostMapping("deleteAccount")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Account accountDelete(@RequestParam Long accountId){
        return adminService.deleteAccount(accountId);
    }


// TODO Ruta para acceder a las cuentas modifyBalance
//
    @PostMapping("/modifyBalance")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Account accountModifyBalance(@RequestParam Long accountId){
            return adminService.modifyBalance(account, userId, balance);        };
    }




}



