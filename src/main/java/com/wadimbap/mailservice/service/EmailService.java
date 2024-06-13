package com.wadimbap.mailservice.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Сервис для отправки электронных писем.
 */
@Service
@Data
public class EmailService {

    private final JavaMailSender javaMailSender;

    /**
     * Метод для отправки электронного письма.
     *
     * @param to      адрес получателя
     * @param subject тема письма
     * @param text    текст сообщения
     */
    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }
}
