package com.msc.demo;

import org.springframework.stereotype.Controller;

/**
 * @author songchao.ma
 * @since 2017/9/22 18:10
 */
@Controller
public class WsController {
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, "+message.getName()+"!");
    }
}
