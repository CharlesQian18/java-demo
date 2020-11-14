package com.sharpnew.day07.demo05;

import java.util.ArrayList;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-22 21:49
 **/
/*
题目：
定义4个学生对象，添加到集合，并遍历
思路：
1. 创建学生类 Student,四个部分(不包括成员方法)
2. 创建学生对象的集合
4. 创建学生对象
5. 添加到集合中
3.遍历
 */
public class Demo02ArrayListStudent {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Student student1 = new Student();
    student1.setName("张三");
    student1.setAge(18);
    Student student2 = new Student();
    student2.setName("李四");
    student2.setAge(28);
    Student student3 = new Student();
    student3.setName("王五");
    student3.setAge(38);
    Student student4 = new Student();
    student4.setName("赵六");
    student4.setAge(48);
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.forEach(d -> {
      System.out.print(d.getName());
      d.study();
    });
  }
}

