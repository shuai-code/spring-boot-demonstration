package com.shuai.demonstration.configuration;

import org.springframework.context.ApplicationListener;

/**
 * @author Yangs
 */
public class SimpleListener implements ApplicationListener<SimpleEvent> {
    @Override
    public void onApplicationEvent(SimpleEvent event) {
        System.out.println(event.getMessage());
    }
}
