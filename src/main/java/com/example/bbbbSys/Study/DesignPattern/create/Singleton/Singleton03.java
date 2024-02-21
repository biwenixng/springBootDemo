package com.example.bbbbSys.Study.DesignPattern.create.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 双重校验
 */
public class Singleton03 {
    //创建私有的静态的全局对象 volatile保证变量可变性,屏蔽指令重排序
    private volatile static Singleton03 instance;

    //私有构造方法
    private Singleton03(){}

    public  static  Singleton03 getInstance(){
        if (instance == null){
            synchronized (Singleton03.class){
                //判断对象是否为空
                if (instance == null){
                    instance = new Singleton03();
                }
            }
        }
        return  instance;

    }
}
