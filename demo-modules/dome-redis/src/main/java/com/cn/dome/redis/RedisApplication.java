package com.cn.dome.redis;

import com.cn.dome.redis.config.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @Description
 * @ClassName RedisBootstrap
 * @Author zangliulu
 * @date 2020.04.01 14:41
 */
public class RedisApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);
        System.currentTimeMillis();
    }

}
