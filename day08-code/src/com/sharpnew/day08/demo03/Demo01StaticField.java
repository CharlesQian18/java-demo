package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-01 21:51
 **/
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在类，多个对象共享同一份数据
 */

public class Demo01StaticField {
  public static void main(String[] args) {
    Student one = new Student("张三", 19);
    Student two = new Student("李四", 20);
    Student.room = "101";
    one.room="102";//也可以，但是不推荐
    System.out.println("姓名：" + one.getName() + "，年龄：" + one.getAge() + "，教室:" + Student.room + ",学号:" + one.getId());
    System.out.println("姓名：" + two.getName() + "，年龄：" + two.getAge() + "，教室:" + Student.room + ",学号:" + two.getId());
  }
}
