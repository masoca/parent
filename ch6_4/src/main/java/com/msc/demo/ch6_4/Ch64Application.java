package com.msc.demo.ch6_4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class Ch64Application {




	@RequestMapping("/")
	String index(){
		return "author name is ";
	}

	public static void main(String[] args) {
	    SpringApplication.run(Ch64Application.class, args);
    }
}
