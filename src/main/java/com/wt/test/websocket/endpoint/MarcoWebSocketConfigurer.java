package com.wt.test.websocket.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * @Auther: 埼玉
 * @Date: 2018/12/24 20:51
 * @Description:
 */
@EnableWebSocket
@Configuration
@Slf4j
public class MarcoWebSocketConfigurer implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(marcoWebSocketHandler(), "/marco").setAllowedOrigins("*").withSockJS();
    }


    @Bean
    public MarcoWebSocketHandler marcoWebSocketHandler() {
        return new MarcoWebSocketHandler();
    }

    static class MarcoWebSocketHandler extends AbstractWebSocketHandler {

        @Override
        public void afterConnectionEstablished(WebSocketSession session) {
            log.info("connection from:{},message:{}", session.getRemoteAddress());
        }

        @Override
        protected void handleTextMessage(WebSocketSession session, TextMessage message) {
            log.info("receive text message:{}", message.getPayload());
            TextMessage returnMsg = new TextMessage("Polo");
            try {
                Thread.sleep(1000);
                session.sendMessage(returnMsg);
            } catch (Exception e) {
                log.error("error occurs", e);
            }

        }

    }
}
