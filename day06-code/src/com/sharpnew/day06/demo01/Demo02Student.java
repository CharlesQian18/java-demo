package com.sharpnew.day06.demo01;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-07 21:18
 **/
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用

1.导包：也就是指出需要使用的类，在什么位置
import 包名称.类名称;
import com.sharpnew.day06.demo01.Student
对于和当前类属于同一个包的情况，可以省略导包语句不写

2.创建，格式
类名称 对象名= new 类名称()
Student stu=new Student();

3.使用，分两种情况
使用成员变量:对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
(也就是，想用谁，就用对象名点谁)

注意事项:
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
 */
public class Demo02Student {
  public static void main(String[] args) {
    //创建一个对象
    Student student = new Student();
    //输出成员变量
    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println("============");
    student.name = "小红";
    student.age = 28;
    System.out.println(student.name);
    System.out.println(student.age);
    System.out.println("============");
    //调用成员方法
    student.eat();
    student.sleep();
    student.study();
  }
}
