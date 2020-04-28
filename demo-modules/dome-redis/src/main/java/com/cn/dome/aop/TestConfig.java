package com.cn.dome.aop;

import org.springframework.context.annotation.*;

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
