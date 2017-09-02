package com.msc.springboot.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则的被拦截类
 * Created by Song on 2017/6/24.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("DemoMethodService.add()");
    };
}
