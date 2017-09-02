package com.msc.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Song on 2017/7/16.
 */
@Controller
public class HelloController {
    @RequestMapping("index")
    public String hello(){
        return "index";
    }

    @RequestMapping("index2")
    public String hello2(){
        System.out.println(this.getClass());
        System.out.println(this.hashCode());
        return "index2";
    }

}
