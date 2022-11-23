package com.example.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class redisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisSet(){
        redisTemplate.boundValueOps("name").set("dxw");
    }

    @Test
    public void redisGet(){
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }
}
