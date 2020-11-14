package com.sharpnew.consumer.client;

import com.sharpnew.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-15 17:02
 **/
@FeignClient(value = "user-service", fallback = UserClientImpl.class)
public interface UserClient {
  @GetMapping("user/{id}")
  User queryById(@PathVariable("id") Long id);
}
