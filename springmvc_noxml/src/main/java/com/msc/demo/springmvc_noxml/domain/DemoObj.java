package com.msc.demo.springmvc_noxml.domain;

/**
 * 类名称: DemoObj <br>
 * 类描述: <br>
 * 自定义消息转换器
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 10:24
 */
public class DemoObj {
    private String id;
    private String name;

    public DemoObj(String id, String name) {
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
