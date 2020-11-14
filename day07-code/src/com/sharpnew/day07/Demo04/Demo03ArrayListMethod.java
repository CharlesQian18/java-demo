package com.sharpnew.day07.Demo04;

import java.util.ArrayList;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-20 21:37
 **/
/*
ArrayList 当中的常用方法有:
public boolean add(E e); 向集合当中添加元素，参数类型和泛类一致
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
但是对于其他集合来说，add添加动作不一定成功

public E get(int index); 从集合中获取元素，参数就是索引编号，返回值就是对应位置的元素
public E remove(int index); 从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
public int size();获取集合的尺寸长度，返回值是集合中包含的元素个数
 */

public class Demo03ArrayListMethod {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    boolean success = list.add("test");
    System.out.println(list);
    System.out.println(success);

    list.add("王宝强");
    list.add("马蓉");
    list.add("贾乃亮");
    list.add("李小璐");
    String name = list.get(2);
    System.out.println("返回值：" + name);
    String removeName = list.remove(3);
    System.out.println("被删除值:" + removeName);

    System.out.println(list);
    System.out.println("获取集合的长度" + list.size());
    //遍历集合
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
