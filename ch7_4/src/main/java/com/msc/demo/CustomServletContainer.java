package com.msc.demo;

import org.springframework.boot.context.embedded.Compression;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author songchao.ma
 * @since 2017/9/21 20:28
 */
//@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8888);
        ErrorPage errorPage1 = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
        ErrorPage errorPage2 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
        Set<ErrorPage> errorPages = new HashSet<>();
        errorPages.add(errorPage1);
        errorPages.add(errorPage2);
        configurableEmbeddedServletContainer.setErrorPages(errorPages);
        configurableEmbeddedServletContainer.setSessionTimeout(10000, TimeUnit.MILLISECONDS);//10000毫秒
        Compression compression = new Compression();
        compression.setEnabled(true);
        configurableEmbeddedServletContainer.setCompression(compression);//压缩
    }
}
