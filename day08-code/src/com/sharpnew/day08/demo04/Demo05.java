package com.sharpnew.day08.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-17 20:04
 **/
public class Demo05 {
  public static void main(String[] args) {
    for (int i = 7; i < 0; i++) {
      //第一次打印7个
      for (int j = 0; j < i; j++) {
        for (int k = 0; k < i; k++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
