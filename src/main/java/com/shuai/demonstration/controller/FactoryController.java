package com.shuai.demonstration.controller;

import com.shuai.demonstration.configuration.SimpleEvent;
import com.shuai.demonstration.factory.simple.VendorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangs
 */
@RestController
public class FactoryController {
    @Autowired
    ApplicationContext context;
    @Autowired
    VendorFactory<Object> vendorFactory;

    @RequestMapping("/add/log")
    public String doPush(String message) {
        vendorFactory.getVendor(1).doPush();
        return "success";
    }

    @RequestMapping("/add/event")
    public String doEvent(String message) {
        context.publishEvent(new SimpleEvent(this, "test"));
        return "success";
    }
}
