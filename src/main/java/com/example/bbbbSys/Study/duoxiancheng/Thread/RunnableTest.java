package com.example.bbbbSys.Study.duoxiancheng.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现Runnable接口
 * Lock --- 同步代码快---同步方法
 *
 * @author Administrator
 */
public class RunnableTest implements Runnable {
    private int count = 1000;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "抢到第" + (count--) + "张票");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

//    public synchronized void buyTicket() {
//        if (count > 0) {
//            System.out.println(Thread.currentThread().getName() + "抢到第" + (count--) + "张票");
//        }
//    }
}
