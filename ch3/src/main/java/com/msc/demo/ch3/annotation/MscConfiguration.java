package com.msc.demo.ch3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by Song on 2017/9/3.
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Component()//元注解
@ComponentScan//元注解
public @interface MscConfiguration {
    String[] value() default {};
}
