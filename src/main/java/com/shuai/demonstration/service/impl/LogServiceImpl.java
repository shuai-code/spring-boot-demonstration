package com.shuai.demonstration.service.impl;

import com.shuai.demonstration.annotation.RunTime;
import com.shuai.demonstration.service.LogService;
import org.springframework.stereotype.Service;

/**
 * @author Yangs
 */
@Service
public class LogServiceImpl implements LogService {

    @RunTime
    @Override
    public void addLog(String message) {

    }
}
