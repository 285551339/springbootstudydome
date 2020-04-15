package com.cn.dome.redis;

import com.cn.dome.redis.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.stream.Stream;

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
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).stream().forEach(s -> {
            System.out.println(s);
        });
        System.out.println("22222222222222222222");
    }
}
