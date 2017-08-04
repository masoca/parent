package com.msc.demo.springmvc_noxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * 类名称: SseController <br>
 * 类描述: <br>
 * 服务器端消息推送SSE
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 11:24
 */
@Controller
public class SseController {

    @RequestMapping(value = "push",produces = "text/event-stream")//输出的媒体类型为text/event-stream
    public @ResponseBody String push(){//每5s推送一条消息
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3 "+r.nextInt() + "\n\n";
    }
}
