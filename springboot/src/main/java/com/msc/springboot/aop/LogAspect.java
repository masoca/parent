package com.msc.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面
 * Created by Song on 2017/6/24.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(Action)")//切点
    public void annotationPointCut(){};

    @After("annotationPointCut()")//建言
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        System.out.println("注解式拦截, "+annotation.name());
    }
    @Before("execution(* DemoMethodService.*(..))")//建言
    //@Before("execution(* *(..))")//任意方法
    //execution: 在方法执行时触发
    //第1个*: 返回任意类型
    //第2个*: 任意方法
    //..: 任意参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截, "+method.getName());
    }
}
