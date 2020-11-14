package com.sharpnew.user.controller;

import com.sharpnew.user.pojo.User;
import com.sharpnew.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 17:19
 **/
@RestController
@RequestMapping("user")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public User queryById(@PathVariable("id") Long id) {
    return userService.queryById(id);
  }
}
