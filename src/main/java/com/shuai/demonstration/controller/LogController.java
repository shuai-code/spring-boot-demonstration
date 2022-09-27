package com.shuai.demonstration.controller;

import com.shuai.demonstration.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author Yangs
 */
@RestController
public class LogController {
    @Autowired
    LogService logService;

    @RequestMapping("/add/log")
    public String addLog() throws IOException {
        logService.selectOrder();
        return "success";
    }
}
