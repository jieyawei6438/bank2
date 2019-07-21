package com.itcase.bank.config;

import com.itcase.bank.pojo.PaymentProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
//@Configuration
public class PayConfig {

    //注入方式1：
    @Value("${pay.nopassword.maxAmountPerDeal}")
    private long maxAmount;
    @Value("${pay.nopassword.maxAmountTotal}")
    private long maxAmountTotal;
    /**   当spring扫描到Bean注解时就会调用该方法，
     * 生成对象加入spring容器中,return返回值会加入spring容器*/
@Bean
    public PaymentProperties paymentProperties(){
        PaymentProperties prop=new PaymentProperties();
        prop.setMaxAmountPerDeal(maxAmount);
        prop.setMaxAmountTotal(maxAmountTotal);
        return prop;
    }
}
