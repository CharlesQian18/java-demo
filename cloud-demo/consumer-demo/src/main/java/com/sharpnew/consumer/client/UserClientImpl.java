package com.sharpnew.consumer.client;

import com.sharpnew.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-15 17:33
 **/

//注入spring
@Component
public class UserClientImpl implements UserClient {
  @Override
  public User queryById(Long id) {
    User user = new User();
    user.setName("用户不存在或查询失败！");
    return user;
  }
}
