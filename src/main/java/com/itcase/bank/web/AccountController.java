package com.itcase.bank.web;

import com.itcase.bank.pojo.Account;
import com.itcase.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @GetMapping("{id}")
    private Account queryById(@PathVariable("id") Integer id){
        return accountService.queryById(id);
    }
    @PostMapping("transfer")
    public ResponseEntity<Void> transfer(@RequestParam("from") Integer from,
                                         @RequestParam("to") Integer to,
                                         @RequestParam("amount") Integer amount){
            accountService.transfer(from,to,amount);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
