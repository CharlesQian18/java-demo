package com.sharpnew.day07.Demo04;

import java.util.ArrayList;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-20 21:15
 **/
/*
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意改变的

对于ArrayList来说，有一个尖尖括号<E>代表泛型。
泛型：也就是装在集合当中得所有元素，全都是统一类型
注意：泛型只能是引用类型，不能是基本类型

注意事项:
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号:[]
 */
public class Demo02ArrayList {
  public static void main(String[] args) {
    //创建一个ArryList集合，集合名称是list，里面全是String字符串类型
    //备注：从JDK1.7+开始，右侧尖括号内部可以不写内容，但是<>本身还是必须写
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list);
    //add方法添加数据,创建时候规定字符串，所以只能添加字符串
    list.add("侧睡");
    list.add("cbdfds");
    list.add("dfafdas");
    System.out.println(list);
  }
}
