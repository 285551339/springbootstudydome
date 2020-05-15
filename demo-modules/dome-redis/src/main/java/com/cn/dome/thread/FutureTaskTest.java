package com.cn.dome.thread;

import java.util.concurrent.*;

/**
 * @Description
 * @ClassName FutureTaskTest
 * @Author zangliulu
 * @date 2020.05.08 18:04
 */
public class FutureTaskTest {

    public static void newThread(String name, Future<Integer> future) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+Thread.currentThread().getName()+"开始运行");
                try {
                    int result = future.get();
                    System.out.println("线程"+Thread.currentThread().getName()+"获取结果  result=="+result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }, name).start();
    }

    public static void main(String[] args)  {
        FutureTask<Integer> future = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("线程"+Thread.currentThread().getName()+"运行任务");
                Thread.sleep(1000);
                System.out.println("线程"+Thread.currentThread().getName()+"任务运行完成");
                return 100;
            }
        });

        ExecutorService es = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> submit = es.submit(task);
        Future<Integer> submit1 = es.submit(task);


        try {

            Thread.sleep(1000);

        } catch (InterruptedException e1) {

            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {

            System.out.println("task运行结果"+submit.get()+"--"+submit1.get());

        } catch (InterruptedException e) {

            e.printStackTrace();

        } catch (ExecutionException e) {

            e.printStackTrace();

        }
        System.out.println("所有任务执行完毕");
    }

}
