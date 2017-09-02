package com.msc.springboot.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Song on 2017/6/24.
 */
@Configuration
@ComponentScan("com.msc.springboot.aop")
@EnableAspectJAutoProxy//开启spring对aspectj代理的支持
public class AopConfig {
}
