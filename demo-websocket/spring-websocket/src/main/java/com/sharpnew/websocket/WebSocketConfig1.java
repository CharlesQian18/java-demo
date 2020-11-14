package com.sharpnew.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @description:
 * @program: demo-websocket
 * @author: Charles
 * @created: 2020-05-23 9:19
 **/
//@Configuration
public class WebSocketConfig1 {
  /**
   * 	注入ServerEndpointExporter，
   * 	这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
   */
  @Bean
  public ServerEndpointExporter serverEndpointExporter() {
    return new ServerEndpointExporter();
  }
}
