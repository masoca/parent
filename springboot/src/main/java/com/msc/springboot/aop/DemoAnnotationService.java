package com.msc.springboot.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的被拦截类
 * Created by Song on 2017/6/24.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")//1
    public void add(){
        System.out.println("DemoAnnotationService.add()");
    }
}
