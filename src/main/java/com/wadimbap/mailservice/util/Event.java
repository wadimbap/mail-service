package com.wadimbap.mailservice.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Event implements Serializable {

    private String email;
    private String message;
}
