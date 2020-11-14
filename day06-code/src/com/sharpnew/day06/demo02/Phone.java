package com.sharpnew.day06.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-07 21:34
 **/
/*
定义一个类，模拟"手机"事物
 */
public class Phone {
  //成员变量
  String brand;
  double price;
  String color;
  //成员方法
  public void call() {
    System.out.println("打电话");
  }

  public void sendMessage() {
    System.out.println("发短信");
  }
}
