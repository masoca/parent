package com.msc.demo.springmvc_noxml.messageconverter;

import com.msc.demo.springmvc_noxml.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Random;

/**
 * 类名称: MyMessageConverter <br>
 * 类描述: <br>
 *  自定义消息转换器
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 10:21
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj>{//1


    public MyMessageConverter() {
        super( new MediaType("application","x-msc",Charset.forName("utf-8")));//2新建一个自定义的媒体类型
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);//判断DemoObj和另一个类clazz是否相同或是clazz的子类或接口:只处理DemoObj类
    }

    @Override//处理请求的数据
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream body = inputMessage.getBody();
        Charset charset = Charset.forName("utf-8");
        String s = StreamUtils.copyToString(body, charset);
        String[] split = s.split("-");
        DemoObj demoObj = new DemoObj(split[0], split[1]);
        return demoObj;
    }

    @Override//处理应答的数据
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String out = new Random().nextInt(9999)+" hello:"+demoObj.getId()+"-"+demoObj.getName();
        outputMessage.getBody().write(out.getBytes("utf-8"));
    }
}
