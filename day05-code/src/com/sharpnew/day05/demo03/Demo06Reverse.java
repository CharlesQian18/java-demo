package com.sharpnew.day05.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-04 21:26
 **/
/*
数组元素的反转：
本来的样子:[1,2,3,4]
之后的 样子:[4,3,2,1]

要求不能使用新数组，只能使用原来的数组
 */
public class Demo06Reverse {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4};
    System.out.println("打印原来的数组");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println("============");
    /*
    初始化语句：int min=0,max=array.lengtbh-1
    条件判断:min<max
    步进表达式:min++,max--
    循环体：用第三个变量倒手
     */
    for (int min = 0, max = array.length - 1; min < max; min++, max--) {
      int reverse = array[min];
      array[min] = array[max];
      array[max] = reverse;
    }
    System.out.println("============");
    System.out.println("打印新的的数组");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }
}
