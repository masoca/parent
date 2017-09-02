package com.msc.demo.ch6_2_3;

import com.msc.demo.ch6_2_3.AuthorSettings;
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
//@ComponentScan("com.msc.demo.ch6_2_3")//自动扫描,无需配置
public class Ch623Application {

	@Resource
	private AuthorSettings authorSettings;


	@RequestMapping("/")
	String index(){
		return "author name is "+authorSettings.getName()+",author age is "+authorSettings.getAge();
	}

	public static void main(String[] args) {
	    SpringApplication.run(Ch623Application.class, args);
    }
}
