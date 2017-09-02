package com.msc.demo.ch6_2_3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

/**
 * Created by Song on 2017/9/2.
 */
@Component
@ConfigurationProperties(prefix = "author")
@ConfigurationPropertiesBinding
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
