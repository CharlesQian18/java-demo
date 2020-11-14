package com.sharpnew.day08.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-27 19:54
 **/
/*
String 当中与获取相关的常用方法有：

public int length():获取字符串当中含有的字符个数，拿到字符串长度
public String concat(String str);将当前字符串和参数字符串拼接成为返回值新的字符串。
public char chatAt(int index);获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str);查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */
public class Demo02StringGet {
  public static void main(String[] args) {
    //获取字符串的长度
    int length = "abdfdfadsgzdafdfadsfads".length();
    System.out.println(length);

    //拼接字符串
    String str1 = "Hello";
    String str2 = "World";
    String str3 = str1.concat(str2);
    String str4 = "Hello" + "World";
    String str5 = "HelloWorld";
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str3 == str4);//false
    System.out.println(str4 == str5);//true
    System.out.println("======================");
    //获取指定索引位置的单个字符
    char ch = "Hello".charAt(1);
    System.out.println("在1号索引位置的字符是:" + ch);
    System.out.println("==================");
    //参数字符串在原字符串中第一次索引位置,如果没有返回-1
    String original = "HelloWorldllo";
    int index = original.indexOf("llo");
    System.out.println(index);
    System.out.println("HelloWorld".indexOf("bcd"));
  }
}
