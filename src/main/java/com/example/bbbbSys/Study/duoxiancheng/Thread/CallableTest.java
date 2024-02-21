package com.example.bbbbSys.Study.duoxiancheng.Thread;

import java.util.Random;
import java.util.concurrent.Callable;

/** 实现Callable接口
 * @author Administrator
 */
public class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}
