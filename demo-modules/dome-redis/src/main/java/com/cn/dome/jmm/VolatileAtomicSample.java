package com.cn.dome.jmm;
/**
 * volatile无法保证原子性
 */

public class VolatileAtomicSample {

    private volatile   static int counter = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                   // add();
                    counter++;
                }
            });
            thread.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("counter" + counter);
    }



}
