package com.example.springbootdemo;

import com.example.springbootdemo.pojo.Person;
import com.example.springbootdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println("-------------"+person.toString());
    }

}
