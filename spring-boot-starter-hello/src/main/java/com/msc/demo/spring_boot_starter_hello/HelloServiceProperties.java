package com.msc.demo.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author songchao.ma
 * @since 2017/9/5 13:27
 */
@ConfigurationProperties(prefix = "hello")//类型安全的配置
public class HelloServiceProperties {
    private final static String MSG="world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
