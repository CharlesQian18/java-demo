package com.sharpnew.day07.demo01;

import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-10 22:32
 **/
/*
题目输入是输入三个数字，求出最大值
 */
public class Demo03ScannerMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("请输入第一个：" + a);
    int b = sc.nextInt();
    System.out.println("请输入第二个：" + b);
    int c = sc.nextInt();
    System.out.println("请输入第二个：" + c);
    int tem = a > b ? a : b;
    int max = tem > c ? tem : c;
    System.out.println(max);

  }
}
