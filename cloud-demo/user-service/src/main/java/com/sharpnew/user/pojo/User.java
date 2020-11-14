package com.sharpnew.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 17:00
 **/
@Table(name = "sys_user")
@Data
public class User {
  @Id
  @KeySql(useGeneratedKeys = true)
  private Long id;
  private String name;//姓名
  private String keyWord;//关键字
  private Integer sex;//性别
  private Integer age;//年龄
  private Date birthday;//生日
  private String email;//邮箱
  private String content;//内容
  private String createBy;//创建人
  private Date createTime;//创建时间
  private String updateBy;//修改人
  private Date updateTime;//修改时间
}
