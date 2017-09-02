package com.msc.demo.springboot2.demo.springboot2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication//包含@EnableAutoConfiguration开启自动配置注解，可对依赖的jar包如spring-boot-starter-tomcat.jar,spring-webmvc.jar进行自动配置。
//@SpringBootApplication(exclude = {SpecialConfiguration.class})//SpecialConfiguration不使用自动配置
public class Springboot2Application {//springboot应用入口类

	@RequestMapping("/")
	String index(){
		return "Hello springbootdemo";
	}

	public static void main(String[] args) {
		/*
	    SpringApplication.run(Springboot2Application.class, args);
	    */

        SpringApplication springApplication = new SpringApplication(Springboot2Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);//关闭Banner
        springApplication.run(args);

        /*
		new SpringApplicationBuilder(Springboot2Application.class).bannerMode(Banner.Mode.OFF).run();
		*/
    }
}
