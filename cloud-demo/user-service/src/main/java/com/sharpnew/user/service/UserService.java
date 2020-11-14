package com.sharpnew.user.service;

import com.sharpnew.user.mapper.UserMapper;
import com.sharpnew.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.Tree;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 17:15
 **/
@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public User queryById(Long id) {
//    try {
//      Thread.sleep(2000L);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    return userMapper.selectByPrimaryKey(id);
  }
}
