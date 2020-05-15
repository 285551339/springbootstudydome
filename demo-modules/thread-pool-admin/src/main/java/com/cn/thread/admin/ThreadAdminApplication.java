package com.cn.thread.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description
 * @ClassName ThreadApplication
 * @Author zangliulu
 * @date 2020.05.15 11:09
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.cn.thread.admin.mapper")
@EnableAsync
public class ThreadAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThreadAdminApplication.class, args);
    }
}
