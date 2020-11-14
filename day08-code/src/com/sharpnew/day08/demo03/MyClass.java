package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-01 22:15
 **/
public class MyClass {
  int num;//成员变量
  static int numStatic;//静态变量

  public void method() {
    System.out.println("这是一个普通的方法");
    System.out.println(num);
    System.out.println(numStatic);
  }
  public static void methodStatic() {
    System.out.println("这是一个静态方法");
    //System.out.println(num);//报错
    System.out.println(numStatic);
  }
}
