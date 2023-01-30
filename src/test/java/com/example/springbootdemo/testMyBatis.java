package com.example.springbootdemo;

import com.example.springbootdemo.mapper.myBatis;
import com.example.springbootdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class testMyBatis {
    @Autowired
    private myBatis my;

    @Test
    public void test() {
        List<User> list = my.queryUser();
        System.out.println(list);
    }
}
