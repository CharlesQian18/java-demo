package com.sharpnew.consumer.controller;


//import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sharpnew.consumer.client.UserClient;
import com.sharpnew.consumer.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @description:
 * @program: clouddemo
 * @author: Charles
 * @created: 2020-05-14 18:00
 **/
@RestController
@RequestMapping("consumer")
@Slf4j
//@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {
//  @Autowired
//  private RestTemplate restTemplate;

  @Autowired
  private UserClient userClient;

  @GetMapping("{id}")
  public User queryById(@PathVariable("id") Long id) {
    User user = userClient.queryById(id);
    return user;
  }


//
//  @GetMapping("{id}")
////  @HystrixCommand(fallbackMethod="queryByIdFaillback")
////  @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})  @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
////  circuitBreaker.requestVolumeThreshold:触发熔断的最小请求次数,默认 20
////  circuitBreaker.errorThresholdPercentage:触发熔断的失败请求最小占比，默认50
////  circuitBreaker.sleepWindowInMilliseconds:休眠时长，默认是5000毫秒
//  @HystrixCommand(commandProperties = {
//      @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
//      @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
//      @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
//  })
//
//  public String queryById(@PathVariable("id") Long id) {
//    if (id % 2 == 0) {
//      throw new RuntimeException("");
//    }
//    //自己执行负载均衡，然后替换地址
//    String url = String.format("http://user-service/user/%s", id);
//    System.out.println(url);
//    String user = restTemplate.getForObject(url, String.class);
//    return user;
//  }

  /*
  因为是默认，所以不能限定参数
   */
  public String defaultFallback() {
    return "服务调用失败，网络异常，请稍后重试！";
  }

  public String queryByIdFaillback(Long id) {
    log.error("查询用户失败,id:{}", id);
    return "服务调用失败，网络异常，请稍后重试！";
  }


  //注入 discoveryClient 对象
//  @Autowired
//  private DiscoveryClient discoveryClient;

//  @Autowired
//  private RibbonLoadBalancerClient client;

//  @GetMapping("{id}")
//  public User queryById(@PathVariable("id") Long id) {
//
////    //一个服务可以启动多次（同个名称），每次启动的tomcat都是新的实例,所以获取的是实例列表
////    List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
////    // 永远取第一个不可取
////    ServiceInstance instance = instances.get(0);
////   //String url = String.format("http://localhost:8101/user/%s", id);
//
//////   应该从一堆中取一个，应该实现负载均衡算法:随机，轮询（默认），hash，最小访问
////    ServiceInstance instance = client.choose("user-service");
////    String url = String.format("http://%s:%s/user/%s", instance.getHost(), instance.getPort(), id);
//
//    //自己执行负载均衡，然后替换地址
//    String url = String.format("http://user-service/user/%s", id);
//    System.out.println(url);
//    User user = restTemplate.getForObject(url, User.class);
//    return user;
//  }
}
