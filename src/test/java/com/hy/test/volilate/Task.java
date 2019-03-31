package com.hy.test.volilate;

/**
 * Author wanghaiyuan
 * Date 2019/3/29 14:20.
 */
public class Task implements Runnable{
    volatile boolean isRunning = true;
    public void run() {
        int i = 0;
        while (isRunning){
            System.out.println(i++);
        }
    }
}
