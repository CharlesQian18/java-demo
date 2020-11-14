package com.sharpnew.day08.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-28 19:53
 **/
/*
String 当中与转换相关的常用方法有:
public char[] toCharArray(); 将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes();获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串
备注: CharSequence 意思就是说可以接受字符串类型。
 */
public class Demo04StringConvert {
  public static void main(String[] args) {
    char[] charArray = "HelloWorld".toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i]);
    }
    System.out.println("=====================");
    byte[] bytes = "HelloWorld".getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]);
    }
    System.out.println("=====================");
    //字符串的内容替换
    String s = "HelloWorld".replace("Hello", "World");
    System.out.println(s);
  }
}
