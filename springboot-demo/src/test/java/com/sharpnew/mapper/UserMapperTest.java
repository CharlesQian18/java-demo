package com.sharpnew.mapper;

import com.sharpnew.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-08 11:19
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  private UserMapper userMapper;

  @Test
  public void testQuery() {
    User user = userMapper.selectByPrimaryKey(1L);
    System.out.println("user=" + user);
  }


}