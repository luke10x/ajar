package dev.luke10x.ajar.flags.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class FeatureFlagConfig {
  @EnableWebMvc
  @Configuration
  public class ApplicationConfiguration implements WebMvcConfigurer {
    @Bean
    public ViewResolver jspViewResolver() {
      InternalResourceViewResolver bean = new InternalResourceViewResolver();
      bean.setPrefix("WEB-INF/jsp/");
      bean.setSuffix(".jsp");
      return bean;
    }
  }
}
