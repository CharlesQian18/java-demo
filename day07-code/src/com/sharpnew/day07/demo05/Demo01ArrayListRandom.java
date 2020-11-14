package com.sharpnew.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-22 21:40
 **/
/*
题目：
生成6个1~33之间的随机整数，添加到集合，并遍历集合
思路:
1. 初始化集合ArrayList
2. 产生随机数，需要用到Random
3.循环6次，使用for循环
4. 生成32的整数，然后整体加一 random.nextInt(33)+1;
5. 使用ArrayList.add 添加元素
6. 遍历集合，输出数据
 */
public class Demo01ArrayListRandom {
  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      //0-32
      int num = random.nextInt(33) + 1;
      arrayList.add(num);
    }
    for (Integer arr : arrayList) {
      System.out.println("输出的随机数为:" + arr);
    }

  }
}
