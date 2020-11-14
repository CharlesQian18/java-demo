package com.sharpnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 16:53
 **/
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.sharpnew.user.mapper")
public class UserApplication {
  public static void main(String[] args) {
    SpringApplication.run(UserApplication.class);
  }
}
