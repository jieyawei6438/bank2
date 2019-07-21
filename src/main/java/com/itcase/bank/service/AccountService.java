package com.itcase.bank.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.itcase.bank.mappers.AccountMapper;
import com.itcase.bank.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public Account queryById(Integer id){
        return accountMapper.queryById(id);

    }


    @Transactional
    //    用于开启事物管理
    public void transfer(Integer from, Integer to, Integer amount) {
    //转入
         accountMapper.updateMoney(to,+amount);
    //转出
         accountMapper.updateMoney(from,-amount);
    }
}
