package com.cn.dome.aop;

import com.cn.dome.redis.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestConfig
 * @Author zangliulu
 * @date 2020.04.02 18:01
 */
@Configuration
@ComponentScan(basePackages = "com.cn.dome.aop")
@EnableAspectJAutoProxy
public class TestConfig {



}
