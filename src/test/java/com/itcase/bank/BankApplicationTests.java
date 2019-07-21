package com.itcase.bank;

import com.itcase.bank.mappers.AccountMapper;
import com.itcase.bank.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankApplicationTests {


    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void contextLoads() {
        Account account=accountMapper.queryById(1);
        System.out.println(account);
    }

}
