package com.cn.dome.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Description
 * @ClassName Test
 * @Author zangliulu
 * @date 2020.04.14 14:37
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("1111111111111111111");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);

        System.out.println("22222222222222222222");
    }
}
