package com.example.bbbbSys.Study.DesignPattern.create.Singleton;

/**
 * 枚举方式
 */
public enum Singleton05 {
    INSTANCE;

    private  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton05 getInstance(){
        return INSTANCE;
    }


}
