package com.sharpnew.websocket;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @description:
 * @program: demo-websocket
 * @author: Charles
 * @created: 2020-05-22 15:09
 **/
@ServerEndpoint("/websocket/{uid}")
public class MyWebSocket {

  /*
  打开
   */
  @OnOpen
  public void onOpen(Session session, @PathParam("uid") String uid) throws IOException {
    System.out.println("websocket已经连接" + session);
    //给客户端响应，欢迎登录
    session.getBasicRemote().sendText(uid+"欢迎登录系统");
  }

  /*
  关闭
   */
  @OnClose
  public void onClose(Session session) {
    System.out.println("websocket已经关闭" + session);
  }

  /*
  客户发来消息
   */
  @OnMessage
  public void onMessage(String message, Session session) throws IOException {
    System.out.println("收到客户端发来的消息--->" + message);
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    session.getBasicRemote().sendText("消息已收到");
  }

}
