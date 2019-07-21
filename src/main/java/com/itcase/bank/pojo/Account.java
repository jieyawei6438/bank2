package com.itcase.bank.pojo;

import lombok.Data;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@Data
public class Account {
    private Integer id;
    private String accountName;
    private long money;


}
