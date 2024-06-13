package com.wadimbap.mailservice.listener;

import com.wadimbap.mailservice.util.Event;
import com.wadimbap.mailservice.service.EmailService;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MailQueueListener {

    private final EmailService emailService;

    public void receiveMessage(Event event) {
        emailService.sendEmail(event.getEmail(), "Notification", event.getMessage());
    }
}
