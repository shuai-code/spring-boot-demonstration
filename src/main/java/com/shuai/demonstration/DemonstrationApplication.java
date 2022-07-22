package com.shuai.demonstration;

import com.shuai.demonstration.configuration.SimpleListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yangs
 */
@SpringBootApplication
public class DemonstrationApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemonstrationApplication.class);
        application.addListeners(new SimpleListener());
        application.run(args);
    }
}
