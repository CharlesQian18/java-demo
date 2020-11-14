package com.sharpnew.day06.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 22:09
 **/
/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量（方法参数）
如果需要访问本类当中得成员变量，需要使用格式:
this.成员变量

"通过谁调用的方法，谁就是this"
 */
public class Person {
  String name;//自己的名字

  //同颜色才是对应的字段
  public void sayHello(String name) {
    System.out.println(name + "你好，我是" + this.name);
    System.out.println(this);
  }
}
