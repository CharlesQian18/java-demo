package com.sharpnew.es.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "intell1", type = "_doc", shards = 1, replicas = 1)
public class Item {
  @Id
  @Field(type = FieldType.Long)
  Long id;
  @Field(type = FieldType.Keyword)
  String title; //标题
  @Field(type = FieldType.Keyword)
  String category;// 分类
  String brand; // 品牌
  @Field(type = FieldType.Double)
  Double price; // 价格
  @Field(type = FieldType.Keyword, index = false)
  String images; // 图片地址
}