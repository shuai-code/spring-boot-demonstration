package com.shuai.demonstration.configuration;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot扩展点, SpringBoot启动完成后会调用
 * @author Yangs
 */
@Slf4j
@Configuration
public class SimpleApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("SpringBoot启动完成, 参数: {}, 执行一些业务初始化操作~~", JSONObject.toJSONString(args));
    }
}
