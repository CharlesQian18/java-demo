package com.sharpnew.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.Security;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-11-03 17:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroTest01 {

  /**
   * 测试用户认证：
   * 认证：用户登录
   * <p>
   * 1. 根据配置文件创建SecurityManagerFactory
   * 2.通过工厂获取 SecurityManager
   * 3.将SecurityManger绑定到当前环境
   * 4.从当前环境构建 subject
   * 5.构建shiro 登录的数据
   * 6.主体登录
   */
  @Test
  public void createSecurityMangerFactory() {
    //1. 根据配置文件创建SecurityManagerFactory
    Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-test-1.ini");
    // 2.通过工厂获取 SecurityManager
    SecurityManager securityManager = factory.getInstance();
    //3.将SecurityManger绑定到当前环境
    SecurityUtils.setSecurityManager(securityManager);
    //4.从当前环境构建 subject
    Subject subject = SecurityUtils.getSubject();
    //5.构建shiro 登录的数据
    String username = "zhangsan";
    String password = "123456";
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
    //6.主体登录
    subject.login(token);

    //验证用户是否登录成功
    System.out.println("用户是否登录成功=" + subject.isAuthenticated());
    //获取登录成功后的数据
    System.out.println(subject.getPrincipal());


  }
}
