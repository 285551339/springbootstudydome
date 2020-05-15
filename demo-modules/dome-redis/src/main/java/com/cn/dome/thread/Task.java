package com.cn.dome.thread;

import java.util.concurrent.Callable;

/**
 * @Description
 * @ClassName Task
 * @Author zangliulu
 * @date 2020.05.09 14:19
 */
public class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("子线程在进行计算");

        Thread.sleep(3000);

        int sum = 0;

        for(int i=0;i<100;i++){
            sum += i;
        }
        return sum;
    }
}
