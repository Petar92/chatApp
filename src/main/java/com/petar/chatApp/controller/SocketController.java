package com.petar.chatApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.petar.chatApp.model.ChatMessage;

@Controller
public class SocketController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public ChatMessage send(@Payload ChatMessage message) {
        return message;
    }
}
