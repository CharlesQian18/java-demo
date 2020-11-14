package com.sharpnew.day04.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-04-29 21:06
 **/
/*
题目要求: 定义一个方法，用来【求出】两个数字之和。（你帮我算，算完之后结果告诉我）
题目变形: 定义一个方法，用来【打印】两个数字之和。（你来计算，算完之后你自己负责显示结果，不用告诉我）

注意事项：
对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用。
但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用。
 */


public class Demo04MethodReturn {
  public static void main(String[] args) {
    int num = getSum(10, 20);
    System.out.println("返回值是" + num);
    System.out.println("=======");
    printSum(10, 40);
  }

  private static int getSum(int a, int b) {
    int result = a + b;
    return result;
  }

  private static void printSum(int a, int b) {
    int result = a + b;
    System.out.println(result);
  }
}
