package com.sharpnew.day08.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-31 17:27
 **/
/*
定义一个方法，把数组{1,2,3} 按照制定格式拼接成一个字符串.格式如下:[word1#word#word3]
分析:
1. 创建一个int数组，存放{1,2,3}
2. 定义一个方法
返回值类型: 字符串
方法名称: convertArrayToString
参数列表: int []
3. 格式：[word1#word2#word3]
3.1 遍历数组，每个字符串前面+word，后面+#
3.2 如果是最后一个，则不加
4. 打印输出
 */
public class Demo06StringPractise {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    System.out.println(convertArrayToString(array));
  }

  public static String convertArrayToString(int[] array) {
    String str = "[";
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        str += "word" + array[i] + "]";
      } else {
        str += "word" + array[i] + "#";
      }
    }
    return str;
  }
}
