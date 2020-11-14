package com.sharpnew.day06.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 22:03
 **/

/*
对于基本类型当中的boolean值，Getter方法一定要写成isXXX的形式，而setXXX规则不变
 */
public class Sutdent {
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;//姓名

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int age;

  public boolean isMale() {
    return male;
  }

  public void setMale(boolean male) {
    this.male = male;
  }

  private boolean male;
}
