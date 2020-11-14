package com.sharpnew.day07.demo05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-22 22:08
 **/
/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起来集合，使用@分割每个元素
格式参照(元素@元素@元素)
 */
public class Demo03ArrayListPrint {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("张三");
    list.add("李四");
    list.add("王五");
    list.add("赵六");
    String printStr = list.toString().replace("[", "{")
        .replace("]", "}")
        .replace(",", "@");
    System.out.println(printStr);
    System.out.println("==============");
    printList(list);
  }
  /*
  定义方法三要素：
  返回值：只是打印而已，没有运算，没有结果，所以用void
  方法名称：printList
  参数列表：ArrayList
   */
  private static void printList(ArrayList<String> list) {
    System.out.print("{");
    for (int i = 0; i < list.size(); i++) {
      if (i == list.size() - 1) {
        System.out.print(list.get(i) + "}");
        break;
      }
      System.out.print(list.get(i) + "@");
    }
  }
}
