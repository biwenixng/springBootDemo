package com.example.bbbbSys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = SpringBootDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMqTest {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void test(){
        amqpTemplate.convertAndSend("myqueue1","这是内容411111111112");
        System.out.println("发送成功");
    }

}
