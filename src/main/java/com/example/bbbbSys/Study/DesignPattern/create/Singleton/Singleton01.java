package com.example.bbbbSys.Study.DesignPattern.create.Singleton;

/**
 *饿汉式
 * 不能延时加载
 */
public class Singleton01 {
    //创建私有的静态的全局对象
    private static Singleton01 instance = new Singleton01();

    //私有构造方法
    private Singleton01(){}

    //提供一个全局访问点，供外部获取单例对象
    public static Singleton01 getInstance(){
        return  instance;
    }
}
