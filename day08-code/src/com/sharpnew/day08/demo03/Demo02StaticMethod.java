package com.sharpnew.day08.demo03;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-01 22:17
 **/
/*
一旦使用static 修饰成员方法，那么这就成为静态方法，静态方法不属于对象，而是属于类
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用
如果又static关键字,那么不需要创建对象，直接通过类名成来使用它

无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用
静态变量:类名称.静态变量
静态方法:类名称.静态方法()

注意事项:
1. 静态不能直接访问非静态
原因：因为在内存当中是【先】有静态内容，【后】有非静态内容
“先人不知道后人，后人知道先人”
2. 静态方法中不能使用this
原因：this代表当前对象，通过谁调用方法，谁就是当前对象，静态方法不属于对象
 */
public class Demo02StaticMethod {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.method();

    //对与静态方法，可以通过对象名（不推荐）或者类名进行调用
    obj.methodStatic();//正确，不推荐（javac也会转换为类名.静态方法名称）
    MyClass.methodStatic();//正确推荐
    //对于本类当中得静态方法，可以省略类名称
    myMethod();
    Demo02StaticMethod.myMethod();
  }

  public static void myMethod() {
    System.out.println("自己的方法");
  }
}
