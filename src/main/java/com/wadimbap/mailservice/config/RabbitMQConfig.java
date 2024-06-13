package com.wadimbap.mailservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMQConfig {

    public static final String MAIL_QUEUE = "mail_queue";

    @Bean
    public Queue mailQueue() {
        return new Queue(MAIL_QUEUE);
    }
}
