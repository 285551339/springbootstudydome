package com.cn.dome.event;

import org.springframework.context.ApplicationEvent;
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
        cxt.publishEvent(new ApplicationEvent("发布一个事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
    }
}
