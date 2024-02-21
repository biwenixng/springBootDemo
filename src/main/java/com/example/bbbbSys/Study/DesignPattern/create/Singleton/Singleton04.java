package com.example.bbbbSys.Study.DesignPattern.create.Singleton;

/**
 * 静态内部类
 * 静态内部类特性，同时解决延时加载线程安全的问题
 */
public class Singleton04 {


    //私有构造方法
    private  Singleton04(){
        //针对反射对单例的破坏
        if (SingletonHandle.singleton04 != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    //在静态内部类中创建单例，在转载内部类的时候才会创建单例对象
    private static class  SingletonHandle{
        private  static  Singleton04  singleton04 = new Singleton04();
    }

    public  static  Singleton04 getInstance(){
        return  SingletonHandle.singleton04;
    }
}
