package com.itcase.bank.config;

import com.itcase.bank.pojo.PaymentProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * name:${name};
 * time:${time};
 * 用处：
 */
//@Configuration
public class PayConfig2 {


    @Bean
//    @ConfigurationProperties(prefix = "pay.nopassword")
    public PaymentProperties paymentProperties(){
        PaymentProperties prop=new PaymentProperties();
        return prop;
    }

}
