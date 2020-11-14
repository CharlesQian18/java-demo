package com.sharpnew.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-22 22:19
 **/
/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放在小集合当中
要求使用自定义方法来实现筛选
分析：
1. 定义要给大集合，用来存放int数字：<Integet>
2. 随机数字就用Random  nextInt
3. 循环二十次，将随机数字放在大集合:for 循环，add
4. 定义方法
5. 创建一个小集合
6. 循环大集合，元素%2==0 为偶数
7. 用小集合添加偶数
 */
public class Demo01ArrayListReturn {
  public static void main(String[] args) {
    ArrayList<Integer> bigList = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      int num = random.nextInt(100) + 1;
      bigList.add(num);
    }
    ArrayList<Integer> smallList = getsmallList(bigList);
    int i = 0;
    for (Integer integer : smallList) {
      System.out.println("第" + ++i + "个:" + integer);
    }
  }

  private static ArrayList<Integer>  getsmallList(ArrayList<Integer> list) {
    ArrayList<Integer> smallList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      int num = list.get(i);
      if (num % 2 == 0) {
        smallList.add(num);
      }
    }
    return smallList;
  }
}
