package com.sharpnew.day06.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:06
 **/
public class DemoPhoneParam {
  public static void main(String[] args) {
    Phone one=new Phone();
    one.brand="个体";
    one.price=555;
    one.color="333";
    method(one);
  }


  public static void method(Phone param) {
    System.out.println(param.brand);
    System.out.println(param.price);
    System.out.println(param.color);
  }
}
