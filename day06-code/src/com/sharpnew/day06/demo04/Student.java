package com.sharpnew.day06.demo04;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-08 22:18
 **/
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
格式:
public 类名称(参数类型 参数名称){
  方法体
}

注意事项:
1. 构造方法的名称必须和所在的类名称完全一样，就是连大小写也要一样
2. 构造方法不要写返回值类型，连void都不写
3. 构造方法不能return 一个具体的返回值
4. 如果没有编写任何构造方法，那么编译器将默认赠送一个构造方法，没有参数，方法体，什么事情都不做
public Student(){}
5. 一旦编写了至少一个构造方法，那么编译器不再赠送
6. 构造方法也是可以进行重载的
   重载：方法名称相同，参数列表不同

 按照标准，还是要写上Getter/Setter 方法
 如果需要改变对象中的成员变量，还是需要Setter方法
 */
public class Student {
  private String name;
  private int age;

  //用来创建对象
  //无参构造方法
  public Student() {
    System.out.println("创建student");
  }

  //有参构造方法
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("全参构造方法，所用的成员变量都在这里赋值，省去 Setter");
  }

  public int getAge() {
    return age;
  }
}
