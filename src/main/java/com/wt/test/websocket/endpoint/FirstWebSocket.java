package com.wt.test.websocket.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @Auther: 埼玉
 * @Date: 2018/12/25 11:40
 * @Description:
 */
@ServerEndpoint("/hello")
@Component
@Slf4j
public class FirstWebSocket {

    @OnOpen
    public void onOpen(Session session){
        System.out.println("Connection established,client:"+session.getBasicRemote());
        try {
            session.getBasicRemote().sendText("Hello World");
            Thread.sleep(1000);
        } catch (Exception e) {
            log.error("error occurs", e);
        }

    }

    @OnMessage
    public void echo(String incoming){
        System.out.println(incoming);
    }
}
