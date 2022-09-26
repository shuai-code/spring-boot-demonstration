package com.shuai.demonstration.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import com.shuai.demonstration.annotation.RunTime;
import com.shuai.demonstration.annotation.RunTimeClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Yangs
 */
@RunTimeClass
@Slf4j
@Service
public class LogService {

    @Autowired
    ElasticsearchClient elasticsearchClient;

    @RunTime
    public void addLog(String message) {
        log.info("方法执行......");
        if ("".equals(message)) {
            throw new RuntimeException("异常.....");
        }
    }

    public void createIndex() throws IOException {
        elasticsearchClient.indices().create(c -> c.index("order"));
    }
}
