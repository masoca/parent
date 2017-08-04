package com.msc.demo.springmvc_noxml.controller;

import com.msc.demo.springmvc_noxml.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 类名称: AsyncController <br>
 * 类描述: <br>
 *
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 14:09
 */
@Controller
public class AsyncController {

    @Autowired
    private PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getDeferredResult();
    }
}
