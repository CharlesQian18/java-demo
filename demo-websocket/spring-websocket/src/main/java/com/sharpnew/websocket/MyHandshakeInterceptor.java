package com.sharpnew.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

/**
 * @description:
 * @program: demo-websocket
 * @author: Charles
 * @created: 2020-05-22 17:54
 **/
@Component
public class MyHandshakeInterceptor implements HandshakeInterceptor {
  /*
  握手之前，若返回false，则不建立连接
   */
  @Override
  public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
    //将用户id放入socket处理器的会话(WebSocketSession)中
    attributes.put("uid", 1001);
    System.out.println("开始握手。。。。。。。");
    return true;
  }
  @Override
  public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse
      serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
    System.out.println("握手成功............");
  }
}
