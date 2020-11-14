package com.sharpnew.day06.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 21:24
 **/
/*
局部变量和成员变量
1.定义的位置不一样 【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接在类当中

2.作用范围不一样【重点】
局部变量：只有方法当中才可以使用，除了方法不能使用
成员变量：整个类全都可以使用

3. 默认值不一样【重点】
局部变量：没有默认值，如果要想使用，必须手动进行赋值
    ps:方法的参数就是局部变量，调用的时候一定会被赋值
成员变量：如果没有赋值，会有默认值，规则和数组不一样

4. 内存的位置不一样（了解）
局部变量：位于栈内存
成员变量：位于堆内存

5.生命周期不一样（了解）
局部变量：随着方法的进栈而诞生，随着方法出栈而消失
成员变量：随着对象的创建而诞生，随着对象呗垃圾回收而消失

通常情况下，非绝对，局部变量的生命周期小于成员变量

 */
public class Demo01VariableDifference {
  String name;//成员变量

  public void method() {
    int num = 20; //局部变量
    System.out.println(num);
    System.out.println(name);
    name = "test";
  }

  public void methodA(int params) {
    System.out.println(params);

    System.out.println(name);
  }

  public static void main(String[] args) {
    Demo01VariableDifference demo01VariableDifference = new Demo01VariableDifference();
    demo01VariableDifference.method();
    demo01VariableDifference.methodA(0);
  }

}

