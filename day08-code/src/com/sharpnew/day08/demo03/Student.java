package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-01 21:51
 **/
public class Student {
  private int id;//学号
  private String name;//姓名
  private int age;//年龄
  static String room;//所在教室

  private static int idCount;//计数器

  public Student() {
    this.id = ++idCount;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    this.id = ++idCount;
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
