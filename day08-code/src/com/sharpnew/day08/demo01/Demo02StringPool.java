package com.sharpnew.day08.demo01;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-26 21:15
 **/
/*
字符串常量池：程序当中直接写上的双引号字符串，就是在字符串常量池中
对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==是进行【地址值】的比较。
 */
public class Demo02StringPool {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";
    char[] charArray = {'a', 'b', 'c'};
    String str3 = new String(charArray);
    byte[] byteArry = {97, 98, 99};
    String str4 = new String(byteArry);
    System.out.println(str4);
    System.out.println(str1 == str2);//true
    System.out.println(str1 == str3);//false
    System.out.println(str2 == str3);//false
    System.out.println(str1 == str4);//false
    System.out.println(str3 == str4);//false
  }
}
