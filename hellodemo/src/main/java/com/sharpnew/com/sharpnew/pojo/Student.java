package com.sharpnew.com.sharpnew.pojo;

/**
 * @description:
 * @program: hellodemo
 * @author: Charles
 * @created: 2020-05-16 11:14
 **/
public class Student {
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private String name;
  private int age;

  public void study() {
    System.out.println("我在学习");
  }

}
