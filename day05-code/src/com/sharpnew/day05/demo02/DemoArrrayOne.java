package com.sharpnew.day05.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-02 18:31
 **/
/*
同样是引用类型，方法中的数组放生了改变，则参数数组也发生了改变
而字符串类型则不会
猜测：
栈中存放方法名，堆中存放字符串值
字符串赋值的方式，是在堆中开辟新的内存
 */
public class DemoArrrayOne {
  public static void main(String[] args) {
    int[] array = new int[3];//动态初始化
    System.out.println(array[0]);//地址值
    System.out.println(array[1]);//0
    System.out.println(array[2]);//0
    System.out.println("======");//0
    //改变数组当中元素的内容
    array[1] = 10;
    array[2] = 20;
    System.out.println(array);
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println("==========");
    String s = "5";
    String ss=s;
    ss="555";
    setValue(s);
    System.out.println(s);
    System.out.println("==========");
    String[] arrayS = new String[1];
    setValue(arrayS);
    System.out.println(arrayS);
    System.out.println(arrayS[0]);

  }

  public static void setValue(String value) {
    value = "10";
    System.out.println(value);
  }

  public static void setValue(String[] value) {
    value[0] = "10";
    System.out.println(value);
  }
}
