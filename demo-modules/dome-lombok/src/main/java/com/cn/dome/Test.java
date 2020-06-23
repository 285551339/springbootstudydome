package com.cn.dome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt  = new AnnotationConfigApplicationContext(LombokConfig.class);
        Order order = (Order) cxt.getBean("order");
    }
}
