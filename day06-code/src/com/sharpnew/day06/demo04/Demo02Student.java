package com.sharpnew.day06.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 22:22
 **/
public class Demo02Student {
  public static void main(String[] args) {
    Student student = new Student();
    Student stu = new Student("", 10);
    System.out.println(stu.getAge());
  }
}
