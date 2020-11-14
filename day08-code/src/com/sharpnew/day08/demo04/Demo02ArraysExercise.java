package com.sharpnew.day08.demo04;

import java.util.Arrays;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-03 22:16
 **/
/*
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排序，并倒序打印
思路：
1. 新建要给随机的字符串"dsfasdfdasfadsfadsfdasfadsfdasfsd"
2. 将字符串转换成数组 toCharArray()
3.升序 排序 Arrays.sort()
4. 倒序打印 ---遍历反向输出即可
 */
public class Demo02ArraysExercise {
  public static void main(String[] args) {
    String str = "ds4fasdfdasfadsfadsfdasfadsfdasfsd333";
    //将字符串转换成数组 toCharArray()
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    for (int i = charArray.length - 1; i >= 0; i--) {
      System.out.println(charArray[i]);
    }
  }

}
