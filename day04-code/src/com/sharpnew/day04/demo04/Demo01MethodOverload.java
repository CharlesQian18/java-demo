package com.sharpnew.day04.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-04-29 22:12
 **/
public class Demo01MethodOverload {
  public static void main(String[] args) {
    System.out.println(sum(1, 2));
    System.out.println(sum(1, 2,3));
    System.out.println(sum(1, 2,3,4.00));
    System.out.println();
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static int sum(int a, int b, int c, double d) {
    return a + b + c + (int)d;
  }
  public static int sum(double a, int b, int c, int d) {
    return (int)a + b + c + d;
  }
}
