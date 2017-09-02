package com.msc.springboot.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Song on 2017/7/16.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("dev profile testBean");
    }

    @Bean
    @Profile("pro")
    public TestBean proTestBean(){
        return new TestBean("pro profile testBean");
    }


}
