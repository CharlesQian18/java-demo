package com.sharpnew.day07.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 18:47
 **/
public class Person {
  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void showName() {
    System.out.println("名字:" + name);
  }

  private String name;
}
