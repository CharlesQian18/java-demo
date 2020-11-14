package com.sharpnew.day04.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-04-29 21:50
 **/
/*
題目要求：
定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03Method {

  public static void main(String[] args) {
    printCount(100);
  }

  /*
  三要素:
  返回值类型:只是进行了一大堆打印操作而已，没有必要告诉我返回值
  方法名称：printCount
  参数列表：到底要打印多少次？必须告诉我，否则不知道打印多少次，int
   */
  public static void printCount(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Helloword" + i);
    }

  }
}
