package com.sharpnew.test.freemarker.controller;

import com.sharpnew.test.freemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-07 11:10
 **/
@RequestMapping("/freemarker")
@Controller
public class FreemarkerController {

  @GetMapping("/test1")
  public String test1(Model model) {
    model.addAttribute("name", "测试");
    return "/test1";
  }

  @GetMapping("/test2")
  public String test2(Map<String, Object> map) {
    map.put("name", "测试");
    return "test1";
  }

  @GetMapping("/test3")
  public String test3(Map<String, Object> map) {
    //向数据模型放数据
    map.put("name", "程序猿");
    Student stu1 = new Student();
    stu1.setName("小明");
    stu1.setAge(18);
    stu1.setMoney(1000.86f);
    stu1.setBirthday(new Date());

    Student stu2 = new Student();
    stu2.setName("小红");
    stu2.setMoney(200.1f);
    stu2.setAge(19);

//        stu2.setBirthday(new Date());
    List<Student> friends = new ArrayList<>();
    friends.add(stu1);
    stu2.setFriends(friends);//添加朋友们
    stu2.setBestFriend(stu1);//小红最好的朋友是小明

    List<Student> stus = new ArrayList<>();
    stus.add(stu1);
    stus.add(stu2);

    //向数据模型放数据
    map.put("stus", stus);
    //准备map数据
    HashMap<String, Student> stuMap = new HashMap<>();
    stuMap.put("stu1", stu1);
    stuMap.put("stu2", stu2);
    //向数据模型放数据
    map.put("stu1", stu1);
    //向数据模型放数据
    map.put("stuMap", stuMap);
    //返回模板文件名称
    return "test1";
  }

  @GetMapping("/test4")
  public String test4(Map<String, Object> map) {
    //向数据模型放数据
    Student stu1 = new Student("小明", 20, new Date(), 1000.86f, null, null);
    Student stu2 = new Student("小红", 18, new Date(), 10001.86f, null, null);
    List<Student> stus = new ArrayList<>();
    stus.add(stu1);
    stus.add(stu2);
    //向数据模型放数据
    map.put("stus", stus);
    //返回模板文件名称
    return "test1";
  }

  @GetMapping("/test5")
  public String test5(Map<String, Object> map) {
    Student stu1 = new Student("小明", 20, new Date(), 1000.86f, null, null);
    Student stu2 = new Student("小红", 18, new Date(), 10001.86f, null, null);
    HashMap<String, Student> stuMap = new HashMap<>();
    stuMap.put("stu1", stu1);
    stuMap.put("stu2", stu2);
    //向数据模型放数据
    map.put("stuMap", stuMap);
    //返回模板文件名称
    return "test2";
  }


}
