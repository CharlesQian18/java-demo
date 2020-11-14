package com.sharpnew.day05.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-04 20:52
 **/
/*
空指针类型：
所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有

数组必须进行new初始化才能使用其中的元素。
如果只是赋值一个null，没用进行new创建，
那么将会发生：
空指针异常 java.lang.NullPointerException

原因: 忘了new
解决: 补上new
 */
public class Demo02ArrayNull {
  public static void main(String[] args) {
    String ss=null;
    System.out.println(ss);
    int[] array=null;
    System.out.println(array[0]);
  }
}
