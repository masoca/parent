package com.msc.demo.ch3.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Song on 2017/9/3.
 */
@Service()
public class DemoService {
    public void printHello(){
        System.out.println("Hello!");
    }
}
