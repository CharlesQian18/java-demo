package com.sharpnew.config;

import com.sharpnew.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-07 16:50
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
  }
}
