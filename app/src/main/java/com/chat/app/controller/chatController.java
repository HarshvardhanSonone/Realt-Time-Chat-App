package com.chat.app.controller;


// controller handle incoming  msg
// sent from FE    broadcast to all the clients


import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;

public class chatController {
    @MessageMapping("/sendMessage")// client send to ep this method process .....similar to http req
    @SendTo("/topic/msg") // broadcast/return the msg wgich are subs to the topic
    public ChatMessage sendMessage(ChatMessage message){

        return  message;
    }

    @GetMapping("/chat")
    public String chat(){

        return "chat";
    }
}
