package com.wadimbap.mailservice.util;

import lombok.Data;

import java.io.Serializable;

/**
 * Класс события для передачи данных о почтовом сообщении.
 */
@Data
public class Event implements Serializable {

    /**
     * Адрес электронной почты получателя.
     */
    private String email;

    /**
     * Текст сообщения.
     */
    private String message;
}
