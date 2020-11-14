package com.sharpnew.charles;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.bson.Document;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.*;

/**
 * MongoDBDemo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/24/2020</pre>
 */
public class MongoDBDemoTest {
  MongoCollection<Document> mongoCollection;

  @Before
  public void before() throws Exception {
    //  建立连接
    MongoClient mongoClient = MongoClients.create("mongodb://188.188.3.19:27017");
    //选择数据库
    MongoDatabase testdb = mongoClient.getDatabase("testdb");
    //选择表
    mongoCollection = testdb.getCollection("user");
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: main(String[] args)
   * 查询age<=50 并且id>100的用户信息，按id倒序，只返回id，age字段，不返回_id 字段
   * 思路分析：
   * 1. age<=50 , find({age:{$lte:50}},{id:{$gt:100}})
   * 2. 按照id倒序  sort({id:-1})
   * 3. 只返回id,age find({age:{$lte:50},id:{$gt:100}},{id:1,age:1})
   */
  @Test
  public void testMain() throws Exception {
    mongoCollection.find(and(
        lte("age", 50),
        gte("id", 100)
    )).sort(descending("id"))
        .projection(fields(
            include("id", "age"),//包含
            exclude("_id") //排除
        ))
        .forEach((Consumer<? super Document>) document -> {
          System.out.println(document.toJson());
        });

  }

  @Test
  public void testInsert() {
    Document document = new Document();
    document.append("id", 9999);
    document.append("username", "李四");
    document.append("age", 50);

    this.mongoCollection.insertOne(document);
    this.mongoCollection.find(eq("id", 9999)).forEach((Consumer<? super Document>) document1 -> {
      System.out.println(document1.toJson());
    });
  }

  @Test
  public void testUpdate() {
    UpdateResult updateResult = this.mongoCollection.updateOne(eq("id", 9999), Updates.set("age", 45));
    //返回结果集
    System.out.println(updateResult);
    this.mongoCollection.find(eq("id", 9999)).forEach((Consumer<? super Document>) document -> {
      System.out.println(document.toJson());
    });
  }

  @Test
  public void testDelete() {
    DeleteResult deleteResult = this.mongoCollection.deleteMany(eq("age", 25));
    System.out.println(deleteResult);
  }
} 
