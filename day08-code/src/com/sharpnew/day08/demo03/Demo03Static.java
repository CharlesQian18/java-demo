package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-03 21:49
 **/
/*
静态代码块:
public class 类名称{
   static{
        //静态代码块的内容
   }
}
特点：当第一次用到本类时，静态代码块执行唯一一次
静态方法优先与非静态，所以静态代码块比构造方法先执行
静态代码块的典型用途：
用来一次性地对静态成员变量进行赋值
 */
public class Demo03Static {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 =  new Person();
  }
}
