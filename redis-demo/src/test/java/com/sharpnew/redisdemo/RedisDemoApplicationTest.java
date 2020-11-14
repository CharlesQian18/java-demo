package com.sharpnew.redisdemo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * RedisDemoApplication Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>09/02/2020</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDemoApplicationTest {

  @Autowired
  private StringRedisTemplate redisTemplate;

  /**
   * Method: main(String[] args)
   * opsFor
   */
  @Test
  public void testMain() {
    redisTemplate.opsForValue().set("test", "hello world");
    String test = redisTemplate.opsForValue().get("test");
    System.out.println("test=" + test);

    BoundHashOperations<String, Object, Object> ops = redisTemplate.boundHashOps("user:123");
    ops.put("name", "Rose");
    ops.put("age", "21");
    System.out.println(ops.get("name"));
    System.out.println(ops.get("age"));

    Map<Object, Object> entries = ops.entries();
    System.out.println("entries=" + entries);
  }


} 
