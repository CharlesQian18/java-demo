package com.sharpnew.day04.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-04-27 20:46
 **/
/*
定义格式:
public static void 方法名称(){
  方法体;
}
调用格式:
方法名称()

注意事项:
1.方法定义的先后顺序无所谓
2.方法定义必须挨着的，不能在一个方法的内部定义另一个方法
3.方法定义后，自己不会执行；如果希望执行，一定要进行方法的调用
 */

public class Demo01Method {
  public static void main(String[] args) {
    printMehod();
  }

  public static void printMehod() {
    for (int j = 0; j < 20; j++) {
      for (int i = 0; i < 5; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
