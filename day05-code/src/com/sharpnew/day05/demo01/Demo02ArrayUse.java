package com.sharpnew.day05.demo01;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-02 17:05
 **/
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值
二进制:01
十进制:0123456789
16进制:0123456789abcdef

访问数组元素的格式:数组名称[索引值]
索引值:就是一个int数字，代表数组当中元素的编号
【注意】索引值从0开始，一直到"数组长度-1"为止
 */
public class Demo02ArrayUse {
  public static void main(String[] args) {
    int[] array = {10, 20, 30};
    System.out.println(array);

    System.out.println(array[0]);
    System.out.println("===========");
    //也可以将数组值赋予变量
    int num= array[1];
    System.out.println(num);
  }
}
