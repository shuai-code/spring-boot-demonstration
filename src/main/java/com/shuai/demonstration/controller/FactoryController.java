package com.shuai.demonstration.controller;

import com.shuai.demonstration.factory.simple.VendorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangs
 */
@RestController
public class FactoryController {
    @Autowired
    VendorFactory<Object> vendorFactory;

    @RequestMapping("/add/log")
    public String doPush(String message) {
        vendorFactory.getVendor(1).doPush();
        return "success";
    }
}
