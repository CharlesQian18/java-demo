package com.sharpnew.day04.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-04-29 21:22
 **/
public class Demo01MethodSame {
  public static void main(String[] args) {
    System.out.println(isSame(12,15));
    System.out.println(isSame(12,12));
  }

  /*
  三要素：
  返回值类型：boolean
  方法名称: isSame
  参数列表：int a , int b
   */
  public static boolean isSame(int a, int b) {
//    boolean same;
    return a == b;
  }
}
