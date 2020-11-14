package com.sharpnew.day06.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-07 21:37
 **/
public class Demo01PhoneOne {
  public static void main(String[] args) {
    Phone phone = new Phone();
    System.out.println(phone.brand);
    System.out.println(phone.color);
    System.out.println(phone.price);

    phone.call();
    phone.sendMessage();;

  }
}
