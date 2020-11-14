package com.sharpnew.day05.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-04 21:20
 **/
/*
求出数组中的最大值
 */
public class Demo05ArrayMax {
  public static void main(String[] args) {
    int[] array = {11, 23, 54, 657, 897, 9809, 8909, -034, 234, 2354, 657,};
    int max = array[0];//第一个值
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println(max);
  }
}
