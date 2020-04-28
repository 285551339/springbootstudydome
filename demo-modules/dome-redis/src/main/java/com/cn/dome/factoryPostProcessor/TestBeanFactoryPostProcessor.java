package com.cn.dome.factoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestBeanFactoryPostProcessor
 * @Author zangliulu
 * @date 2020.04.28 17:06
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("IOC 容器调用了TestBeanFactoryPostProcessor的postProcessBeanFactory方法");
        for(String name:beanFactory.getBeanDefinitionNames()) {
            System.out.printf("name:"+name);
            if("testLog".equals(name)) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
                //beanDefinition.setLazyInit(true);
            }

        }
    }
}
