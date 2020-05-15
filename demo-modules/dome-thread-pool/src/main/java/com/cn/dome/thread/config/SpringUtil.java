package com.cn.dome.thread.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName SpringUtil
 * @Author zangliulu
 * @date 2020.05.15 13:51
 */
@Slf4j
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //创建一个新的ApplicationContext对象
        if (SpringUtil.applicationContext == null){
            SpringUtil.applicationContext = applicationContext;
        }

        log.info("ApplicationContext配置成功,applicationContext对象："+SpringUtil.applicationContext);
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    public static <T> T getBean(Class<T> tClass){
        return getApplicationContext().getBean(tClass);

    }

    public static <T> T getBean(String name,Class<T> tClass){
        return getApplicationContext().getBean(name,tClass);
    }
}
