package com.example.bbbbSys;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootDemoApplicationTests {


    @Autowired
    private Environment env;
    @Test
    void contextLoads() {
        System.out.println("--------------------"+env.getProperty("spring.application.name"));
    }

}
