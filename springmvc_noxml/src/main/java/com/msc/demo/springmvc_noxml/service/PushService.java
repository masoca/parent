package com.msc.demo.springmvc_noxml.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * 类名称: PushService <br>
 * 类描述: <br>
 *
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 14:24
 */
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getDeferredResult() {
        deferredResult = new DeferredResult < String >();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)//固定周期运行：每5s运行
    public void refresh(){
        if (deferredResult!=null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
