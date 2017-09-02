package com.msc.springboot.aop;

import java.lang.annotation.*;

/**
 * 拦截规则的注解
 * Created by Song on 2017/6/24.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();//1
}
