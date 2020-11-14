package com.sharpnew.day05.demo01;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-02 17:14
 **/
/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下:
如果是整数类型，那么默认为0;
如果是浮点类型，那么默认为0.0;
如果是字符类型，那么默认为'\u0000'(字符类型的默认，不可见字符);
如果是布尔类型，那么默认为false
如果是引用类型，那么默认为null

注意事项:
静态初始化其实也是默认值的过程，只不过系统自动马上默认值替换成为了大括号当中的具体数值。
 */
public class Demo03ArrayUse {

  public static void main(String[] args) {
    int[] array=new int[3];
    array[1]=15;
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);


    System.out.println("=================");
    char[] arrayA = new char[2];
    System.out.println(arrayA[0]);

  }
}
