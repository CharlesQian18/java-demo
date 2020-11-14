package com.hjh.springboot.one.demo.service.impl;

import com.hjh.springboot.one.demo.dao.UserMapper;
import com.hjh.springboot.one.demo.pojo.User;
import com.hjh.springboot.one.demo.pojo.UserExample;
import com.hjh.springboot.one.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HJH
 * @Description: 测试实现
 * @date 2019/7/26 11:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public List<User> list() {
        UserExample userExample = new UserExample();
        return userMapper.selectByExample(userExample);
    }

}
