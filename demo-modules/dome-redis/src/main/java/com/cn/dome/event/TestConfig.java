package com.cn.dome.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @ClassName TestConfig
 * @Author zangliulu
 * @date 2020.04.02 18:01
 */
@Configuration
@ComponentScan(basePackages = "com.cn.dome")
@EnableAspectJAutoProxy
public class TestConfig {



}
