package com.example.springbootdemo;

import com.example.springbootdemo.pojo.Person;
import com.example.springbootdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    private Environment env;
    @Test
    void contextLoads() {
        System.out.println("--------------------"+env.getProperty("spring.application.name"));
    }

}
