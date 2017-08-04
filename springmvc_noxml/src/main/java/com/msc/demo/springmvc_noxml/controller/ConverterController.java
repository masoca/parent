package com.msc.demo.springmvc_noxml.controller;

import com.msc.demo.springmvc_noxml.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类名称: ConverterController <br>
 * 类描述: <br>
 * 自定义消息转换器
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 10:44
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "convert",method = RequestMethod.POST,produces = {"application/x-msc"})//指定返回的媒体类型为我们自定义的application/x-msc
    public @ResponseBody  DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
