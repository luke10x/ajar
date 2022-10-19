package dev.luke10x.ajar.flags.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "dev.luke10x.ajar.flags")
public class FeatureFlagApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FeatureFlagApplication.class);
    }
}