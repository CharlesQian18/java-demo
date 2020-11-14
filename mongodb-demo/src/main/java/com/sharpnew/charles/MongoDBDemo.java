package com.sharpnew.charles;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.function.Consumer;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-24 11:19
 **/
public class MongoDBDemo {
  public static void main(String[] args) {
    //  建立连接
    MongoClient mongoClient = MongoClients.create("mongodb://188.188.3.19:27017");
    //选择数据表
    MongoDatabase mongoDatabase = mongoClient.getDatabase("testdb");
    //选择表
    MongoCollection<Document> userCollection = mongoDatabase.getCollection("user");
    //查询数据
    userCollection.find().limit(10).forEach((Consumer<? super Document>) document -> {
      System.out.println(document.toJson());
    });
    mongoClient.close();
  }
}
