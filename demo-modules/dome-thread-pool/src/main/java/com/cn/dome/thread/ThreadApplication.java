package com.cn.dome.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Description
 * @ClassName ThreadApplication
 * @Author zangliulu
 * @date 2020.05.15 11:09
 */
@SpringBootApplication
@EnableAsync
public class ThreadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThreadApplication.class, args);
    }
}
