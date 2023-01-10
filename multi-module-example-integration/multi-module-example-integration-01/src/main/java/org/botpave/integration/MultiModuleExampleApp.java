package org.botpave.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.botpave")
public class MultiModuleExampleApp {
    public static void main(String[] args) {
        SpringApplication.run(MultiModuleExampleApp.class, args);
    }
}