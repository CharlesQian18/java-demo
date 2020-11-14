package com.sharpnew;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-06 14:12
 **/

@SpringBootApplication
@MapperScan("com.sharpnew.mapper")
public class BootDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootDemoApplication.class, args);
  }
}
