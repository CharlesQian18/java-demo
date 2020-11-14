package com.sharpnew.day08.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-28 20:19
 **/
/*
分割字符串的方法:
public String[] split(String regex):按照参数格式，将字符串且为若干部分
 注意事项：
 split方法的参数其实是一个“正则表达式”
 注意：如果按照英文句点"."进行切分，必须写“\\.”
 */
public class Demo05StringSplit {
  public static void main(String[] args) {
    String str1="aaa,bbb,ccc";
    String[] array1= str1.split(",");
    for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i]);
    }
    System.out.println("====================");
    String str2= "aaa abb adcc";
    String[] array2 = str2.split(" ");
    for (int i = 0; i < array2.length; i++) {
      System.out.println(array2[i]);
    }
    System.out.println("====================");
    String str3="XXX.YYY.ZZZ";
    String[] array3 = str3.split(".");
    for (int i = 0; i < array3.length; i++) {
      System.out.println(array3[i]);
    }

  }
}
