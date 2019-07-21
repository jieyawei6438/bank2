package com.itcase.bank.mappers;

import com.itcase.bank.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@Mapper
public interface AccountMapper {
    public Account queryById(Integer id);

    public void updateMoney(@Param("id") Integer id,@Param("amount") Integer amount);



}
