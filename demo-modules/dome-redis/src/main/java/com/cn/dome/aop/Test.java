package com.cn.dome.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @ClassName Test
 * @Author zangliulu
 * @date 2020.04.14 18:57
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext  cxt  = new AnnotationConfigApplicationContext(TestConfig.class);
        AspectService aspectService = (AspectService) cxt.getBean(AspectService.class);
        aspectService.doSomeThing("臧刘露" ,"安徽 ");
    }
}
