package com.sharpnew.web;

import com.sharpnew.pojo.User;
import com.sharpnew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-06 14:15
 **/
@RestController
@RequestMapping("user")
public class HelloController {
  @Autowired
  private DataSource dataSource;

  @Autowired
  private UserService userService;

  @GetMapping("{id}")
  public User hello(@PathVariable("id") Long id) {
    return userService.queryById(id);
  }
}
