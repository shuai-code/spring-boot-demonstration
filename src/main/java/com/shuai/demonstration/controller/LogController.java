package com.shuai.demonstration.controller;

import com.shuai.demonstration.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yangs
 */
@RestController
public class LogController {
    @Autowired
    LogService logService;

    @RequestMapping("/add/log")
    public String addLog(String message) {
        logService.addLog(message);
        return "success";
    }
}
