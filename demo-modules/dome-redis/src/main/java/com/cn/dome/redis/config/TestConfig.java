package com.cn.dome.redis.config;

import com.cn.dome.redis.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.*;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestConfig
 * @Author zangliulu
 * @date 2020.04.02 18:01
 */
@Component
public class TestConfig {

    @Autowired
    private Dog  dog;

    @Bean
    public Dog get(){
        return   new Dog();
    }
}
