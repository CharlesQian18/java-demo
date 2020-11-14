package com.sharpnew.day07.Demo04;

import java.util.ArrayList;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-21 18:51
 **/
/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类
基本类型  包装类（引用类型，包装类都位于java.lang包下）
byte       Byte
int        Integer  【特殊】
long       Long
float      Float
double    Double
char      Character  【特殊】
boolean    Boolean
从JDK1.5+开始，支持自动装箱，自动拆箱
自动装箱：基本类型-----》包装类型
自动拆箱：包装类型-----》基本类型
 */
public class Demo04ArrayListBasic {
  public static void main(String[] args) {
    //写法错误！泛型只能引用类型，不能是基本类型
//    ArrayList<int> listB=new ArrayList<int>();
    ArrayList<Integer> list =new ArrayList<>();
    list.add(1245);
    //获取元素
    System.out.println(list.get(0));
  }
}
