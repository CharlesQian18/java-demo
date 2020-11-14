package com.sharpnew.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-08-08 11:01
 **/
@Data
@Table(name = "tb_user")
public class User {

  @Id
  @KeySql(useGeneratedKeys = true)
  private Long id;

  private String userName;

  private String passWord;

  private String name;

  private Integer age;

  //不可持久化的
  @Transient
  private String note;
}
