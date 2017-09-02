package com.msc.springboot.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Song on 2017/6/24.
 */
@Configuration
public class JavaConfig {
    @Bean
    public TestService testService2(){//方法名随意
        return new TestService();
    }
    @Bean
    public UseTestService useTestService2(){//方法名随意，返回值类型与Main方法中context.getBean(UseTestService.class);中参数类型相同
        UseTestService useTestService = new UseTestService();
        useTestService.setTestService2(testService2());
        return useTestService;
    }
}
