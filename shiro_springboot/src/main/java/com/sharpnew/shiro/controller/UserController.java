package com.sharpnew.shiro.controller;

import com.sharpnew.shiro.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Enumeration;

@RestController
public class UserController {

  @Autowired
  private UserService userService;


  /**
   * 个人主页
   * 使用shiro注解鉴权
   * @RequiresPermissions() -- 访问此方法必须具备的权限
   * @RequiresRoles() -- 访问此方法必须具备的角色
   */

  /**
   * 1.过滤器;如果权限信息不匹配setUnauthorizedUrl地址
   * 2.注解：如果权限信息不匹配，抛出异常
   */

  @RequiresPermissions("user-add")
  @RequestMapping(value = "/user/home", method = RequestMethod.GET)
  public String home() {
    return "访问个人主页成功!";
  }


  //添加
  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public String add() {
    return "添加用户成功";
  }

  //查询
  @RequestMapping(value = "/user", method = RequestMethod.GET)
  public String find() {
    return "查询用户成功";
  }

  //更新
  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public String update(String id) {
    return "更新用户成功";
  }

  //删除
  @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
  public String delete() {
    return "删除用户成功";
  }

  //用户登录
  @RequestMapping(value = "/login")
  public String login(String username, String password) {
    //构建登录令牌
    try {
      /**
       * 密码加密:
       *      shiro提供的md5加密
       *      Md5Hash:
       *      参数一：加密的内容
       *              111111 --- abcd
       *      参数二：盐（加密的混淆字符串）（用户登录的用户名）
       *              111111 + 混淆字符串
       *      参数三：加密次数
       */
      password = String.valueOf(new Md5Hash(password, username, 3));
      UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);
      //1.获取 subject
      Subject subject = SecurityUtils.getSubject();
      //获取session
      String sid = String.valueOf(subject.getSession().getId());

      //2.调用subject 进行登录
      subject.login(upToken);
      System.out.println("用户登录");
      return "登录成功:" + sid;
    } catch (Exception e) {
      return "用户名或者密码错误";
    }

  }

  @RequestMapping(value = "/autherror", method = RequestMethod.GET)
  public String autherror(int code) {
    return code == 1 ? "未登录" : "未授权";
  }

  //登录成功后，打印所有session内容
  @RequestMapping(value = "/show")
  public String show(HttpSession session) {
    // 获取session中所有的键值
    Enumeration<?> enumeration = session.getAttributeNames();
    // 遍历enumeration中的
    while (enumeration.hasMoreElements()) {
      // 获取session键值
      String name = enumeration.nextElement().toString();
      // 根据键值取session中的值
      Object value = session.getAttribute(name);
      // 打印结果
      System.out.println("<B>" + name + "</B>=" + value + "<br>/n");
    }
    return "查看session成功";
  }
}
