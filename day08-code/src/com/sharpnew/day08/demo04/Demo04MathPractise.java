package com.sharpnew.day08.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-03 23:11
 **/
/*
题目:
计算在 -10.7 到5.9 ，绝对值大于6或者小于2.1的整数有多少个？
思路：
1. 起始位置为 -10 ，转换方法:
  2.1 可以使用Math.ceil方法，向上(向正方向)取整
  2.2 强转int，自动舍弃所有小数位
2.设置最小值为min=Math.ceil(-10.7) ，最大值为max=6.8 ,计算个数变量 count
3.有范围循坏for, 判断条件 ++min 是否超过最大值
4. 符合条件,Math.abs(++min)满足条件, count++

备注：使用使用Math.ceil方法，-10.8可以变成-10.0,double也是可以进行++
 */
public class Demo04MathPractise {
  public static void main(String[] args) {
    double min = -10.7;
    double max = 5.9;
    int count = 0;
    for (int i = (int) min; i < max; i++) {
      int num = Math.abs(i);
      if (num > 6 || num < 2.1) {
        count++;
      }
    }
    System.out.println(count);
  }
}
