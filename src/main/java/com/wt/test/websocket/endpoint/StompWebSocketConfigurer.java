package com.wt.test.websocket.endpoint;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
//
///**
// * @Auther: 埼玉
// * @Date: 2018/12/25 14:26
// * @Description:
// */
//@EnableWebSocketMessageBroker
//@Configuration
//public class StompWebSocketConfigurer implements WebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry){
//        registry.addEndpoint("/stomp").setAllowedOrigins("*").withSockJS();
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry){
//        registry.enableSimpleBroker("topic","/queue");
//        registry.setApplicationDestinationPrefixes("/app");
//    }
//
//}
