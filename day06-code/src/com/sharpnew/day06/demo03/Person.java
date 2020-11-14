package com.sharpnew.day06.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:51
 **/
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
解决方案：用private 关键字将需要保护的成员变量进行修饰

一旦使用了private 进行修饰，那么本类中仍然可以随意访问
但是，本类范围之外不能访问

间接访问 private成员变量，就是定义一对Getter/setter方法
对于Getter来说，不能有参数，返回值类型和成员变量对应
对于Setter来说，不能有返回值，参数类型和成员变量对应

 */
public class Person {
  String name;//姓名
  private int age;//年龄

  public void show() {
    System.out.println("我叫：" + name + "年龄：" + age);
  }

  //这个成员方法，专门对于向age设置值
  public void setAge(int num) {
    if (num < 100 && num >= 0) {
      age = num;
    }
    else {
      System.out.println("数据不合理");
    }

  }

  //这个成员方法，专门获取私有成员变量的值
  public int getAge() {
    return age;
  }
}
