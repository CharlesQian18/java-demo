package com.sharpnew.day06.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:42
 **/
/*
面向对象三大特征：封装，继承，多态

1. 方法就是一种封装
2. 关键字 private 也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见
 */

public class Demo02Method {
  public static void main(String[] args) {
    int[] array = {5, 15, 25, 100};
    System.out.println(getMax(array));
  }

  //求出数组最大值
  public static int getMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }
}
