package com.cn.dome.thread.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Description
 * @ClassName ThreadConfig
 * @Author zangliulu
 * @date 2020.05.15 11:18
 */
@Configuration
public class ThreadConfig {
    @Bean("taskExecutor")
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);//线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        taskExecutor.setAwaitTerminationSeconds(60);//设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(200);
        taskExecutor.setQueueCapacity(Integer.MAX_VALUE);//缓冲执行任务的队列
        taskExecutor.setThreadNamePrefix("netcafe-activity-thread-");
        return taskExecutor;
    }
}
