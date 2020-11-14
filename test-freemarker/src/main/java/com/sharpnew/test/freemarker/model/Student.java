package com.sharpnew.test.freemarker.model;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-06-07 10:47
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  private String name;//姓名
  private int age;//年龄
  private Date birthday;//生日
  private Float money;//钱包
  private List<Student> friends;//朋友列表
  private Student bestFriend;//最好的朋友
}
