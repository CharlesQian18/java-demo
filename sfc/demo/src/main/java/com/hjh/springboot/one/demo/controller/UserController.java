package com.hjh.springboot.one.demo.controller;

import com.hjh.springboot.one.demo.pojo.User;
import com.hjh.springboot.one.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HJH
 * @Description: 测试USER
 * @date 2019/7/26 11:45
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> userList = userService.list();
        model.addAttribute("userList",userList);
        return "userList";
    }

}
