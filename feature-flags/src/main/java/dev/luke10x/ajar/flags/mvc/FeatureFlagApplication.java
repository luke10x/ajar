package dev.luke10x.ajar.flags.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//(scanBasePackages = "com.baeldung.boot.jsp")
public class B2bDashboardApplication extends SpringBootServletInitializer {

    // @Override
    // protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    //     return builder.sources(B2bDashboardApplication.class);
    // }

    public static void main(String[] args) {
        SpringApplication.run(B2bDashboardApplication.class);
    }
}