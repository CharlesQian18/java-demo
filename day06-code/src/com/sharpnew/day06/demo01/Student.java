package com.sharpnew.day06.demo01;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-07 21:08
 **/
/*
属性(是什么)
姓名
年龄

行为(能做什么)
吃饭
睡觉学习

对应到Java的类当中
成员变量（属性）
String name;//姓名
int age; //年龄
成员方法(行为)：
public void eat(){}
public void sleep(){}
public void study(){}

注意事项:
1. 成员变量是直接定义再类当中的，再方法外边。
2. 成员方法不要写static 关键字
*/
public class Student {
  //成员变量
  String name;//名字
  int age;//年龄

  //成员方法
  public void eat() {
    System.out.println("吃饭");
  }

  public void sleep() {
    System.out.println("睡觉");

  }

  public void study() {
    System.out.println("学习");
  }
}
