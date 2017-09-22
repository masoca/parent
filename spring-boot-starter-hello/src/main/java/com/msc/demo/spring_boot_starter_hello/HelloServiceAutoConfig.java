package com.msc.demo.spring_boot_starter_hello;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author songchao.ma
 * @since 2017/9/5 13:36
 */
@ConditionalOnClass(HelloService.class)//判断HelloService是否存在（于类加载路径）
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing = true)
public class HelloServiceAutoConfig {

    @Resource
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)//容器中不存在这个bean时
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
