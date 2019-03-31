package com.hy.test.volilate;

/**
 * Author wanghaiyuan
 * Date 2019/3/29 14:26.
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(100);
        task.isRunning = false;
    }
}
