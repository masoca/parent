package com.msc.demo.springmvc_noxml;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 类名称: WebInitializer <br>
 * 类描述: <br>
 *
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/7/26 16:47
 */
public class WebInitializer implements WebApplicationInitializer {



    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
        servlet.setAsyncSupported(true);//服务器消息推送异步方法支持

    }

}
