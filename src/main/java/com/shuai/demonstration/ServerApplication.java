package com.shuai.demonstration;

import com.shuai.demonstration.configuration.SimpleListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Yangs
 */
@EnableJpaRepositories
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ServerApplication.class);
        application.addListeners(new SimpleListener());
        application.run(args);
    }
}
