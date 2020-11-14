package com.sharpnew.day07.demo02;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-11 18:45
 **/
/*
创建对象的标准格式:
类名称  对象名=new 类名称();

匿名对象就是只用右边的对象，没有左边的名字和赋值运算符
new  类名称()

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定一个对象只使用唯一的一次，就可以使用匿名对象
 */
public class Demo01Anonymous {
  public static void main(String[] args) {
    Person one = new Person();
    one.setName("ttt");
    one.showName();//我叫ttt
    System.out.println("============");

    //匿名对象
    new Person().setName("匿名对象");
    //每次new都是新开一个堆内存
    new Person().showName();//返回null
  }
}
