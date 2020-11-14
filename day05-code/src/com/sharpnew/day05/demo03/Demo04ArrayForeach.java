package com.sharpnew.day05.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-04 21:14
 **/
/*
遍历数组，说的就是对数组当中的每一个元素进行逐一，挨个处理。默认的处理方式就是打印输出。
 */
public class Demo04ArrayForeach {
  public static void main(String[] args) {
    int[] array = {1, 3, 24, 35, 454, 657, 6786, 87,};
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}
