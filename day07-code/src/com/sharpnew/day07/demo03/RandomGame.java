package com.sharpnew.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 19:51
 **/
/*
题目：
用代码模拟猜数字的小游戏

思路:
1. 首先需要产生一个随机数字，并且一旦产生不再变化，用Random的nextInt方法
2. 输入一个数字，使用Scanner输入n
如果n大于随机数，范围变成[0,n)
如果n小于随机数，范围变成(n,100]
如果n=随机数，输出你赢了，结束
 */
public class RandomGame {
  public static void main(String[] args) {
    Random r = new Random();
    int num = r.nextInt(101);
    System.out.println("随机数" + num);
    int min = 0;
    int max = 100;
    Scanner sc = new Scanner(System.in);
    while (true) {
      int printNum = sc.nextInt();
      if (printNum > num) {
        max = printNum > max ? max : printNum - 1;
      } else if (printNum < num) {
        min = printNum < min ? min : printNum + 1;
      } else {
        System.out.println("你赢了" + printNum);
        break;
      }
      System.out.println("数字在" + min + "到" + max + "之间");
    }
  }
}
