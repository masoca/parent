package com.msc.demo.springmvc_noxml;

import com.msc.demo.springmvc_noxml.messageconverter.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * 类名称: MyMvcConfig <br>
 * 类描述: <br>
 *
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/7/26 16:42
 */
@Configuration
@ComponentScan("com.msc.demo.springmvc_noxml")
@EnableWebMvc
@EnableScheduling
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Bean//文件上传
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(1000000);//100W字节
        return resolver;
    }

    @Override//快捷的ViewController
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/sse").setViewName("/sse");
        registry.addViewController("/async").setViewName("/async");
    }

    //自定义消息转换器
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(myMessageConverter());
    }

    @Bean
    public MyMessageConverter myMessageConverter(){
        return new MyMessageConverter();
    }

    //静态资源映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration resourceHandlerRegistration = registry.addResourceHandler("/assets/**");
        resourceHandlerRegistration.addResourceLocations("classpath:/assets/");
    }
}
