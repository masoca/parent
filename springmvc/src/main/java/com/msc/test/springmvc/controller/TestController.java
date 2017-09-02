package com.msc.test.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msc.test.springmvc.service.TestService;

/**
 * Created by Song on 2017/4/10.
 */
@Controller
public class TestController {
	
	@Resource
	private TestService testService;

    @RequestMapping(value="test",method = RequestMethod.GET)
    public String test(Model model){
        System.out.println("test...");
        testService.sayHello();
        List<String> list = new ArrayList<String>();
        list.add("Msc");
        model.addAttribute("list",list);
        return "test";
    }
    
    @RequestMapping(value="test1",method = RequestMethod.GET)
    public String test1(Model model){
        return "test1";
    }
    
    @RequestMapping(value="test2",method = RequestMethod.GET)
    public String test22(Model model){
        return "test2";
    }
    
    @RequestMapping(value="2/test",method = RequestMethod.GET)
    public String test2(Model model){
        System.out.println("test...");
        testService.sayHello();
        List<String> list = new ArrayList<String>();
        list.add("Msc");
        model.addAttribute("list",list);
        return "test";
    }
    
    @RequestMapping(value="2/3/test",method = RequestMethod.GET)
    public String test3(Model model){
        System.out.println("test...");
        testService.sayHello();
        List<String> list = new ArrayList<String>();
        list.add("Msc");
        model.addAttribute("list",list);
        return "test";
    }
    
    @RequestMapping(value="tologin",method = RequestMethod.GET)
    public String tologin(Model model){
    	System.out.println("tologin...");
    	return "login";
    }
}
