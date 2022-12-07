package com.ironhack.BankingAccount.Controller;



import com.ironhack.BankingAccount.Entities.Account.Account;
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
    public Account createChecking(@RequestBody Account account, @RequestParam Long userId) {
return adminService.createChecking(account, userId);
    }


    //Ruta para poder crear la cuenta Savings
    @PostMapping("/createSavings")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createSavings(@RequestBody Account account, @RequestParam Long userId){
        return adminService.createCreditCard(account, userId);
    }

    //Ruta para poder crear la cuenta CreditCard
@PostMapping("/createCreditCard")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createCreditCard(@RequestBody Account account, @RequestParam Long userId){
        return adminService.createCreditCard(account, userId);
}

    //Ruta para poder crear la cuenta thirdParty
    @PostMapping("/createThirdParty")
    @ResponseStatus(HttpStatus.CREATED)
    public Account createThirdParty(@RequestBody Account account, @RequestParam Long userId){
        return adminService.createThirdParty(account, userId);
    }


}



