package com.sharpnew.day08.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-03 22:46
 **/
/*
java.util.Math 类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
public static double ads(double num)：获取绝对值
public static double ceil(double)：向上取整。 就是小数点后面的数字清零，正数个位+1
public static double floor(double num):向下取整。就是小数点后面的数字清零，负数个位+1
public static long round(double num):四舍五入，正负一样，不带小数点
Math.PI(double) ：代表近似圆周率
 */
public class Demo03Math {
  public static void main(String[] args) {
    //获取绝对值
    System.out.println(Math.abs(-5.56));
    System.out.println("==============");
    //向上取整
    System.out.println(Math.ceil(-3.54));//
    System.out.println(Math.ceil(3.54));
    System.out.println("==============");
    //向下取整
    System.out.println(Math.floor(-3.54));
    System.out.println(Math.floor(3.54));
    System.out.println("==============");
    //四舍五入
    System.out.println(Math.round(5.51));
    System.out.println(Math.round(-5.51));
    System.out.println("==============");
    System.out.println(Math.round(5.41));
    System.out.println(Math.round(-5.41));
    System.out.println("==================");
    System.out.println(Math.PI);
  }
}
