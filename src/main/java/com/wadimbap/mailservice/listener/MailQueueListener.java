package com.wadimbap.mailservice.listener;

import com.wadimbap.mailservice.util.Event;
import com.wadimbap.mailservice.service.EmailService;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Класс-слушатель для обработки сообщений из очереди почты.
 */
@Component
@Data
public class MailQueueListener {

    private final EmailService emailService;

    /**
     * Метод для приема и обработки сообщений из очереди почты.
     *
     * @param event событие, содержащее детали электронной почты и сообщение
     */
    public void receiveMessage(Event event) {
        emailService.sendEmail(event.getEmail(), "Notification", event.getMessage());
    }
}
