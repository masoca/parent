package com.msc.springboot.javaconfig;

/**
 * Created by Song on 2017/6/24.
 */
public class UseTestService {
    TestService testService;

    public void sayHello(String name){
        testService.sayHello(name);
    }

    public void setTestService2(TestService testService){
        this.testService = testService;
    }

}
