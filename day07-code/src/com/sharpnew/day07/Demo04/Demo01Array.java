package com.sharpnew.day07.Demo04;

import java.util.ArrayList;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 20:36
 **/
/*
题目：
定义一个数组，用来存储3个Persion对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
 */
public class Demo01Array {
  public static void main(String[] args) {
    //创建一个长度为3的数组，里面存放Person类型的对象
    Person[] persons = new Person[3];
    Person one = new Person("test", 85);
    Person tow = new Person("test1", 85);
    Person three = new Person("test2", 85);
    //将one的地址值赋值到数组中的0号元素位置
    persons[0] = one;//地址值
    persons[1] = tow;//地址值
    persons[2] = three;//地址值
    System.out.println(persons[0]);
    System.out.println(persons[1]);
    System.out.println(persons[2]);
    System.out.println("===============");
    System.out.println(persons[0].getName());
  }
}
