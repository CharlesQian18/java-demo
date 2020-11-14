package com.sharpnew.charles;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * PersonDAO Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>05/24/2020</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonDAOTest {

  @Autowired
  private PersonDAO personDAO;

  /**
   *插入
   */
  @Test
  public void testSavePerson() throws Exception {
    Person person = new Person(ObjectId.get(), "test", 20, new Address("人民路", "上海市", "666666"));
    Person person1 = personDAO.savePerson(person);
    System.out.println(person1);
  }
  //查询
  @Test
  public void testSearchPerson() {
    List<Person> personList = personDAO.queryPersonListByName("李四");
    personList.forEach(person ->
        System.out.println(person)
    );
  }

  //分页查询
  @Test
  public void testSearchPersonPage() {
    List<Person> personList = personDAO.queryPersonListByName(1, 2);
    personList.forEach(person ->
        System.out.println(person)
    );
  }
  //更新
  @Test
  public void testUpdatePerson() {
    Person person = new Person(new ObjectId("5eca0ddca925aa12dd474b07"), "test", 200, new Address("人民路", "上海市", "666666"));
    UpdateResult updateResult = personDAO.update(person);
    System.out.println(updateResult);
  }
  //删除
  @Test
  public void testDeletePerson() {
    DeleteResult deleteResult = personDAO.deleteById("5eca0ddca925aa12dd474b07");
    System.out.println(deleteResult);
  }


}
