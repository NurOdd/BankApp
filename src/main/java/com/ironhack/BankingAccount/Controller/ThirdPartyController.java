package com.ironhack.BankingAccount.Controller;


import com.ironhack.BankingAccount.Services.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdPartyController {

    @Autowired
    ThirdPartyService thirdPartyService;

    @PostMapping("/")




}
