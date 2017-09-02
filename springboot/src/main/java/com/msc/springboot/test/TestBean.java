package com.msc.springboot.test;

/**
 * Created by Song on 2017/7/16.
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
