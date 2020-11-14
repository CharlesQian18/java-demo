package com.sharpnew.day06.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:13
 **/
public class Demo05PhoneReturn {
  public static void main(String[] args) {
    Phone tow = getOne();
    System.out.println(tow.brand);//苹果
    System.out.println(tow.price);//175
    System.out.println(tow.color);//玫瑰金
  }

  public static Phone getOne() {
    Phone one = new Phone();
    one.brand = "苹果";
    one.price = 175;
    one.color = "玫瑰金";
    return one;

  }
}
