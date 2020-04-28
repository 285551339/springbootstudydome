package com.cn.dome.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestApplicationListener
 * @Author zangliulu
 * @date 2020.04.28 14:45
 */
@Component
public class TestApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("TestApplicationListener 接受到了一个事件"+event);
    }
}
