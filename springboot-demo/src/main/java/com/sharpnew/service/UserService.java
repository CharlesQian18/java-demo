package com.sharpnew.service;

import com.sharpnew.mapper.UserMapper;
import com.sharpnew.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-08 11:39
 **/
@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public User queryById(Long id) {
    return userMapper.selectByPrimaryKey(id);
  }
}
