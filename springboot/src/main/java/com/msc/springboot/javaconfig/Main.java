package com.msc.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Song on 2017/6/24.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseTestService bean = context.getBean(UseTestService.class);
        bean.sayHello("Masc");
        context.close();

    }
}
