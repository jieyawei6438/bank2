package com.itcase.bank.web;

import com.itcase.bank.pojo.PaymentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@RestController
@RequestMapping("bank")
public class BankController {

/**  用于注入*/
    @Autowired
    private PaymentProperties properties;

    @Autowired
    private DataSource dataSource;

    @GetMapping("prop")
    public String bank(){
        return "单笔交易限额："+properties.getMaxAmountPerDeal()+","+"每日最大限额"+properties.getMaxAmountTotal()+properties.getUser();
//       return String.format("单笔交易限额：%d,每日最大限额:%d",properties.getMaxAmountPerDeal(),properties.getMaxAmountPerDeal());

//        以上也是用于字符串拼接
    }
    @GetMapping("hello")
    public String hello(){
     return "飞羽之仙";
    }
}
