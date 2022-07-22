package com.shuai.demonstration.configuration;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Yangs
 */
public class SimpleEvent extends ApplicationEvent {

    private String message;

    public SimpleEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
