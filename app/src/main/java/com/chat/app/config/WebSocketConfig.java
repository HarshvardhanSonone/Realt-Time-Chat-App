package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig   implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
registry.addEndpoint("/chat")
        .setAllowedOrigins("http://localhost:8080")
        .withSockJS(); // add compa for clients for the client wich not suppoet sokets
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
registry.enableSimpleBroker("/topic");//handle mag topics
        // set msg broker
registry.setApplicationDestinationPrefixes("/app");


    }
}
