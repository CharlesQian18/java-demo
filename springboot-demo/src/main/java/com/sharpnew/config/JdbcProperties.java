package com.sharpnew.config;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-06 15:56
 **/
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
  String url;
  String driverClassName;
  String username;
  String password;

  /*
    yml配置可以注入对象
   */

  User user = new User();

  class User {
    String name;
    int age;
    List<String> language;
  }
}
