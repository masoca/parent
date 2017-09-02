package com.msc.demo.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Song on 2017/9/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("context.getBean(DemoSevice.class):::::::::"+demoService);//context.getBean(DemoSevice.class):::::::::com.msc.demo.ch3.annotation.DemoSevice@6321e813
        demoService.printHello();//Hello!


        //Object bean = context.getBean("com.msc.demo.ch3.annotation");//org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'com.msc.demo.ch3.annotation' is defined
        //System.out.println("context.getBean(\"com.msc.demo.ch3.annotation\"):"+bean);

        Object bean2 = context.getBean("demoConfig");
        System.out.println("context.getBean(\"demoConfig\"):::::::::"+bean2);//context.getBean("demoConfig"):::::::::com.msc.demo.ch3.annotation.DemoConfig@6321e813
        context.close();
    }
}
