package com.sharpnew.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-06 15:01
 **/
//@Configuration
//@PropertySource("classpath:application.yml")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
//  @Value("${jdbc.url}")
//  String url;
//  @Value("${jdbc.driverClassName}")
//  String driverClassName;
//  @Value("${jdbc.username}")
//  String username;
//  @Value("${jdbc.password}")
//  String password;

//  @Autowired
//  JdbcProperties jdbcProperties;
//
  // JdbcProperties jdbcProperties;
//  public JdbcConfig(JdbcProperties jdbcProperties) {
//    this.jdbcProperties = jdbcProperties;
//  }
//
//  @Bean
//  public DataSource dataSource(JdbcProperties prop) {
//    DruidAbstractDataSource dataSource = new DruidDataSource();
//    dataSource.setDriverClassName(prop.getDriverClassName());
//    dataSource.setUrl(prop.getUrl());
//    dataSource.setUsername(prop.getUsername());
//    dataSource.setPassword(prop.getPassword());
//    return dataSource;
//  }

  /*
   当spring 扫描到此类时，执行方法，检查方法上有ConfigurationProperties注解，则去调用和属性相关的set方法
   */
//  @Bean
//  @ConfigurationProperties(prefix = "jdbc")
//  public DataSource dataSource() {
////    return new DruidDataSource();
//  }
}
