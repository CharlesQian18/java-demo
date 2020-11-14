package com.sharpnew.charles;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @program: demobase
 * @author: Charles
 * @created: 2020-05-24 13:55
 **/
@Component
public class PersonDAO {
  @Autowired
  private MongoTemplate mongoTemplate;

  public Person savePerson(Person person) {
    return this.mongoTemplate.save(person);
  }

  /*
   根据名字查询数据
   */
  public List<Person> queryPersonListByName(String name) {
    Query query = Query.query(Criteria.where("name").is(name));
    return this.mongoTemplate.find(query, Person.class);
  }

  /*
  分页获取
   */
  public List<Person> queryPersonListByName(Integer page, Integer rows) {
    Query query = new Query().limit(rows).skip((page - 1) * rows);
    return this.mongoTemplate.find(query, Person.class);
  }

  /*
  修改
   */
  public UpdateResult update(Person person) {
    Query query = Query.query(Criteria.where("id").is(person.getId()));
    Update update = Update.update("age", person.getAge());
    return this.mongoTemplate.updateFirst(query, update, Person.class);
  }

  /*
  删除
   */
  public DeleteResult deleteById(String id) {
    Query query = Query.query(Criteria.where("id").is(id));
    return this.mongoTemplate.remove(query, Person.class);
  }

}
