package com.swedbank.channels.recruitment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class CustomConfig implements WebMvcConfigurer {

  @Bean
  public ClassLoaderTemplateResolver yourTemplateResolver() {
    ClassLoaderTemplateResolver configurer = new ClassLoaderTemplateResolver();
    configurer.setSuffix(".html");
    configurer.setTemplateMode(TemplateMode.HTML);
    configurer.setCharacterEncoding("UTF-8");
    configurer.setOrder(2);  // this is important. This way spring //boot will listen to both places 0 and 1
    configurer.setCheckExistence(true);
    configurer.setCacheable(false);
    return configurer;
  }
}