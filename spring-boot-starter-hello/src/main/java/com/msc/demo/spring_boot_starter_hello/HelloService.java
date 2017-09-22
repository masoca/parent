package com.msc.demo.spring_boot_starter_hello;

/**
 * @author songchao.ma
 * @since 2017/9/5 13:34
 */
public class HelloService {//判断此类是否不能再
    private String msg;
    public String sayHello(){
        return "Hello "+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
