package com.wadimbap.mailservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * Конфигурация RabbitMQ для сервиса отправки почты.
 */
@Configuration
public class RabbitMQConfig {

    /**
     * Наименование очереди для отправки почтовых сообщений.
     */
    public static final String MAIL_QUEUE = "mail_queue";

    /**
     * Создание бина очереди для почтовых сообщений.
     *
     * @return экземпляр очереди для отправки почтовых сообщений
     */
    @Bean
    public Queue mailQueue() {
        return new Queue(MAIL_QUEUE);
    }
}
