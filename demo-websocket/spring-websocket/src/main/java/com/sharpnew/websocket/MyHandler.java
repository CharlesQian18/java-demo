package com.sharpnew.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 * @description:
 * @program: demo-websocket
 * @author: Charles
 * @created: 2020-05-22 16:52
 **/
@Component
public class MyHandler extends TextWebSocketHandler {
  @Override
  public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
    System.out.println("获取到消息 >> " + message.getPayload());
    session.sendMessage(new TextMessage("消息已收到"));
    //当消息等于10，输出0-9
    if (message.getPayload().equals("10")) {
      for (int i = 0; i < 10; i++) {
        session.sendMessage(new TextMessage("消息 -> " + i));
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  @Override
  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    session.sendMessage(new TextMessage("欢迎连接到ws服务"+session.getAttributes().get("uid")));
  }

  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    System.out.println("断开连接！");
  }
}
