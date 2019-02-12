package com.wt.test.websocket.controller;

import com.wt.test.websocket.stomp.Shout;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @Auther: 埼玉
 * @Date: 2019/2/1 17:38
 * @Description:
 */
@Controller
@Slf4j
public class StompController {

    @MessageMapping("/marco")
    @SendTo("/topic/getResponse")
    public Shout handleShout(Shout incoming) {
        log.info("Received message: " + incoming.getMessage());

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        Shout outgoing = new Shout();
        outgoing.setMessage("Polo!");

        return outgoing;
    }
}
