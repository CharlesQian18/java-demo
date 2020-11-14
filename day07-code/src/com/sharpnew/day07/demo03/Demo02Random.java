package com.sharpnew.day07.demo03;

import java.util.Random;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 19:36
 **/
public class Demo02Random {
  public static void main(String[] args) {
    Random r = new Random();
    for (int i = 0; i < 100; i++) {
      System.out.println(r.nextInt(10));
    }
  }
}
