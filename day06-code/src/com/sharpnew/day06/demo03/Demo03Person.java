package com.sharpnew.day06.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:53
 **/
public class Demo03Person {
  public static void main(String[] args) {
    Person person = new Person();
    person.show();

    person.name = "测试";
//    person.age = -20;
    person.setAge(-20);
    person.show();


  }
}
