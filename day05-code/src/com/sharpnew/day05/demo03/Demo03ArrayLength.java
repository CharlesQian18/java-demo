package com.sharpnew.day05.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-04 21:07
 **/
/*
如何获取数组长度，格式
数组名称.length

这将会得到一个int数字，代表数组的长度

数组一旦创建，程序运行期间，长度不可改变
 */
public class Demo03ArrayLength {
  public static void main(String[] args) {
    int[] arrayA = {1, 1, 1, 1, 2, 23, 2, 32, 32, 4, 34, 35, 456, 5465, 7};
    System.out.println( arrayA.length);

    int[] arrayC=new int[3];
    System.out.println(arrayC.length);
    arrayC=new int[5];
    System.out.println(arrayC.length);
  }
}
