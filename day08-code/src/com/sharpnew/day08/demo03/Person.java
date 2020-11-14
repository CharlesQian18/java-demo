package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-03 21:44
 **/
/*
静态代码块:
public class 类名称{
   static{
        //静态代码块的内容
   }
}
特点：当第一次用到本类时，静态代码块执行唯一一次
 */
public class Person {
  static {
    System.out.println("静态代码块执行!");
  }
  public Person(){
    System.out.println("无参构造方法执行");
  }
}
