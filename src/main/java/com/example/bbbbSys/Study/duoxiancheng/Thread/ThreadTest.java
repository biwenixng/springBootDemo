package com.example.bbbbSys.Study.duoxiancheng.Thread;

/**
 * 继承Thread类
 *
 * @author Administrator
 */
public class ThreadTest extends Thread {
    private static int count = 10;

    public ThreadTest(String s) {
        super(s);
    }

    @Override
    public void run() {
        while (true) {
//            buyTicket();
            synchronized ("abc"){
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "抢到第" + (count--) + "张票");
                }
            }
        }
    }

    public static synchronized void buyTicket() {
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + "抢到第" + (count--) + "张票");
        }
    }
}
