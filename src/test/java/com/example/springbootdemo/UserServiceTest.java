package com.example.springbootdemo;

import com.example.springbootdemo.controller.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void test(){
        service.add();
    }

}
