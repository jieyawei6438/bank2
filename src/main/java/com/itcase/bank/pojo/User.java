package com.itcase.bank.pojo;

import lombok.Data;

import java.util.List;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@Data
public class User {
    private String name;
    private Integer age;
    private List<String> girls;
}
