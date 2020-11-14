package com.sharpnew.day07.demo01;

import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-10 22:28
 **/
/*
题目：
输入两个int数字，并且求出和

思路:
1. 要输入，就用Scanner
2. 使用Scanner三个步骤:导包，创建，使用
3.需要是两个数字，使用两次nextInt方法
4. 得到的数字求和
5.将结果打印输出
 */
public class Demo02ScannerSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("输入第一个数字为:" + a);
    int b = sc.nextInt();
    System.out.println("输入第一个数字为:" + b);
    System.out.println("求和:" + (a + b));
  }
}
