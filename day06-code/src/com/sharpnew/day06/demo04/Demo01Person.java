package com.sharpnew.day06.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 22:10
 **/
public class Demo01Person {
  public static void main(String[] args) {
    Person person = new Person();
    //设置自己名字
    person.name = "张三";
    person.sayHello("李四");
    System.out.println(person);

    char get = '2';
    System.out.println(get);
    int g = 35 + get;
    System.out.println(g);
  }
}
