package com.itcase.bank.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
@Data
@Component
/**或则也可用@EnableConfigurationProperties加载启动类上代替@Component*/
@ConfigurationProperties(prefix = "pay.nopassword")
public class PaymentProperties {


/**  单笔交易最大限额*/
    private long maxAmountPerDeal;
/**   每日交易最大限额*/
    private long maxAmountTotal;
/**    使用实体类时必须手动实体化*/
    private User user=new User();
}
