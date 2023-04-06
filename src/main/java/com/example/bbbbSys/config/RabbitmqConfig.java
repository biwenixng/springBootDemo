package com.example.bbbbSys.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    @Bean
    protected Queue queue(){
        Queue queue = new Queue("myqueue1");
        return queue;
    }
}
