package cn.intell.rabbitmq.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MqDemo {

  @Autowired
  private AmqpTemplate amqpTemplate;

  @Test
  public void testSend() throws InterruptedException {
    String msg = "hello, Spring boot amqp, spring.test.exchange";
    this.amqpTemplate.convertAndSend("spring.test.exchange", "a.b", msg);
    // 等待10秒后再结束
    Thread.sleep(10000);
  }

  @Test
  public void testSimpleSend() throws InterruptedException {
    String msg = "hello, Spring boot amqp";
    //自动序列化
    this.amqpTemplate.convertAndSend("simple_queue", msg);
    // 等待10秒后再结束
    Thread.sleep(10000);
  }
}
