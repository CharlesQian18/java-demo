package com.sharpnew.day07.demo01;

import java.util.Scanner;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-10 22:19
 **/
/*
Scanner类的功能：可以实现键盘输入数据，到程序中
引用类型的一般使用步骤：
1.导包
import  包路径.类名称;
如果需要使用的目标的类，和当前类位于同一个包下，则可以省略包语句不写
只有java.lang 包下的内容不需要导包，其他的包都需要import语句
2. 创建
类名称 对象名=new 类名称()
3. 使用
对象名.成员方法()

获取键盘输入的的一个int 数字，int num=sc.nextInt()
获取键盘输入的字符串，String str=sc.next()
 */
public class Demo01Scanner {

  public static void main(String[] args) {
    //创建
    //备注: System.in 代表从键盘中输入
    //绿色代表输入，黑色输出
    Scanner sc = new Scanner(System.in);
    //转换成int类型
    int num = sc.nextInt();
    System.out.println(num);

    //获取输入的字符串
    String str = sc.next();
    System.out.println("输入字符串是" + str);

  }
}
