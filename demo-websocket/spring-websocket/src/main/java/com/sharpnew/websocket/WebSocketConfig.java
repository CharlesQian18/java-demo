package com.sharpnew.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @description:
 * @program: demo-websocket
 * @author: Charles
 * @created: 2020-05-22 16:59
 **/
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
  @Autowired
  private MyHandler myHandler;
  @Autowired
  private MyHandshakeInterceptor myHandshakeInterceptor;
  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    //所有地址可以跨域setAllowedOrigins("*")
    registry.addHandler(this.myHandler, "/ws").setAllowedOrigins("*").addInterceptors(this.myHandshakeInterceptor);
  }
}
