package com.sharpnew.day08.demo02;

import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-31 17:35
 **/
/*
键盘输入一个字符串,并且统计其中各种字符出现的次数
种类有：大写字母，小写字母，数字，其他
 分析：
1. 键盘输入 Scanner类
2. 输入的是字符串  String str = scanner.next();
3.定义四个变量去统计次数
4. 需要对一个字符串检查，要转换成为char[]，方法toCharArray()
5.遍历char[] 字符串数组，对当前字符的种类进行判断，并且用四个变量进行++动作
6.打印输出四个变量，分别待变四种字符串出现次数
 */
public class Demo07StringCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    int countUpper = 0;
    int countLower = 0;
    int countNumber = 0;
    int countOther = 0;

    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      //或者 charArray[i] >= 'a'  && charArray[i] < 'Z'
      if (charArray[i] > 96 && charArray[i] < 123) {
        countLower++;
      } else if (charArray[i] > 64 && charArray[i] < 91) {
        countUpper++;
      } else if (charArray[i] > 48 && charArray[i] < 58) {
        countNumber++;
      } else {
        countOther++;
      }
    }
    System.out.println("小写字母:" + countLower);
    System.out.println("大写字母:" + countUpper);
    System.out.println("数字:" + countNumber);
    System.out.println("其他:" + countOther);
  }
}
