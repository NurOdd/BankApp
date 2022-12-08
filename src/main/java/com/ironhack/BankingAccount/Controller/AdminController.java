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
    //TODO del @RequestBody tienen que ser todos los parametros necesarios?
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

// Ruta para acceder a las cuentas (abrir dos opciones [modifyBalance][deleteAccount]
    //para hacerlo mirar de coger o bien por id de l'account>para uno directamente, o por id del user (devolver lista de accounts vinculadas a este)
    @PostMapping("/accessAccount")
    @ResponseStatus(HttpStatus.OK)
    public Account account(@RequestBody Account Account){
        return null; ///display de la info
    }

    @PostMapping("modifyBalance")
@ResponseStatus(HttpStatus.ACCEPTED)
    public Account account.balance(){
        return adminService.modifyBalance(account, userId, balance);
    }

    @PostMapping("deleteAccount")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Account account(){
        return adminService.deleteAccount(account, userId, accountId);
    }


}



