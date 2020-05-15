package com.cn.dome.thread.biz;

import com.cn.dome.thread.config.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.Executor;

/**
 * @Description
 * @ClassName ThreadBiz
 * @Author zangliulu
 * @date 2020.05.15 11:24
 */
@Service
public class ThreadBiz {


    public void getCoerPoolSize(){
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor)SpringUtil.getBean("taskExecutor");
        System.out.println(taskExecutor.getCorePoolSize());
    }

    public void setCoerPoolSize(Integer size){
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor)SpringUtil.getBean("taskExecutor");
        taskExecutor.setCorePoolSize(size);
        System.out.println(taskExecutor.getActiveCount());
    }
}
