package com.sharpnew.day07.demo02;

import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 18:55
 **/
public class Demo02Anonymous {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//
//    //匿名对象的方式
//    int num1 = new Scanner(System.in).nextInt();
//    System.out.println("输入的是:" + num1);

    //匿名对象作为参数
    methodParam(new Scanner(System.in));
    //匿名对象作为返回值
    System.out.println(methodReturn().nextInt());

  }
  public static void methodParam(Scanner sc) {
    int num = sc.nextInt();
    System.out.println("输入的是:" + num);
  }
  public static Scanner methodReturn() {
    return new Scanner(System.in);
  }
}
