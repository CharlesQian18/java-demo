package com.sharpnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 20:14
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
  public static void main(String[] args) {
    SpringApplication.run(EurekaServer.class);
  }
}
