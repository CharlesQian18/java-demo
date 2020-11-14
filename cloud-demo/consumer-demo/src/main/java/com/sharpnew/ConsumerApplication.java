package com.sharpnew;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 17:50
 **/
//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication
@EnableFeignClients
@SpringCloudApplication
public class ConsumerApplication {
  @Bean
  //拥有该注解，拦截器会自动拦截 RestTemplate请求
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class);
  }
}
