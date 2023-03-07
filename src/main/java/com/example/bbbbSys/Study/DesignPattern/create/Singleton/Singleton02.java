package com.example.bbbbSys.Study.DesignPattern.create.Singleton;

/**
 * 懒汉式
 * 支持延时加载，调用创建方法才会创建对象,线程不安全。添加synchronized线程安全，会减低并发
 */
public class Singleton02 {
    //创建私有的静态的全局对象
    private static Singleton02 instance;

    //私有构造方法
    private Singleton02(){}

    //提供一个全局访问点，供外部获取单例对象。添加synchronized保证多线程情况下单例对象的唯一性，会导致并发低，降低性能
    public static synchronized Singleton02 getInstance(){
        if (instance == null){
            instance = new Singleton02();
        }
        return  instance;
    }
}
