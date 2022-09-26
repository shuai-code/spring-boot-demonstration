package com.shuai.demonstration.service;

import com.shuai.demonstration.annotation.RunTime;
import com.shuai.demonstration.annotation.RunTimeClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Yangs
 */
@RunTimeClass
@Slf4j
@Service
public class LogService {

    @RunTime
    public void addLog(String message) {
        log.info("方法执行......");
        if ("".equals(message)) {
            throw new RuntimeException("异常.....");
        }
    }
}
