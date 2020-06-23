package com.cn.dome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LombokConfig {

    @Bean
    public Order order(){
        return  new Order();
    }
}
