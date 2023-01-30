package com.example.springbootdemo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;


/**
 * @author biwenxing
 */
@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        Object redis = context.getBean("redisTemplate");
        System.out.println(redis);
    }

}
