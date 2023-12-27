package com.example.bbbbSys.Study.duoxiancheng.Thread;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

//    public static void main(String[] args) {
//        Thread.currentThread().setName("main");
//        System.out.println(Thread.currentThread().getName() + "主线程开始");
//        ThreadTest threadTest1 = new ThreadTest("子线程1");
//        threadTest1.start();
//        ThreadTest threadTest2 = new ThreadTest("子线程2");
//        threadTest2.start();
//        ThreadTest threadTest3 = new ThreadTest("子线程3");
//        threadTest3.setPriority(10);
//        threadTest3.start();
//    }

    public static void main(String[] args) throws InterruptedException {
        //定义一个线程对象
//        RunnableTest runnableTest = new RunnableTest();
//        //共享线程对象
//        Thread t1 = new Thread(runnableTest,"线程1");
////        t1.setDaemon(true);
//        //设置优先级 1小 10大
////        t1.setPriority(1);
//        t1.start();
//        //将t1外其他线程设置为阻塞状态
////        t1.join();
//        Thread t2 = new Thread(runnableTest,"线程2");
////        t2.setPriority(10);
//        t2.start();
//        Thread t3 = new Thread(runnableTest,"线程3");
////        t3.setPriority(10);
//        t3.start();
    }


//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CallableTest callableTest = new CallableTest();
//        FutureTask ft = new FutureTask(callableTest);
//        Thread t = new Thread(ft);
//        t.start();
//        Object o = ft.get();
//        System.out.println(o);
//    }
}
