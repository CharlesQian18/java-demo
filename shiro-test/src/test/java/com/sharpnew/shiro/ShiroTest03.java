package com.sharpnew.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-11-03 17:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroTest03 {

  @Before
  public void init() {
    //1. 根据配置文件创建SecurityManagerFactory
    Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-test-3.ini");
    // 2.通过工厂获取 SecurityManager
    SecurityManager securityManager = factory.getInstance();
    //3.将SecurityManger绑定到当前环境
    SecurityUtils.setSecurityManager(securityManager);
  }


  @Test
  public void toLogin() {
    Subject subject = SecurityUtils.getSubject();
    String username = "zhangsan";
    String password = "123456";
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
    //执行Login-->realm域中的构造方法
    subject.login(token);
    //授权:-->realm域中的授权方法
    System.out.println(subject.hasRole("role1"));
    System.out.println(subject.isPermitted("user:save"));
  }
}
