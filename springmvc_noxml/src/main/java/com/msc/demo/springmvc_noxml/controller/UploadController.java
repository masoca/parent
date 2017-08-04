package com.msc.demo.springmvc_noxml.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 类名称: UploadController <br>
 * 类描述: <br>
 *
 * @author songchao.ma
 * @version 1.0.0
 * @since 2017/8/1 9:59
 */
@Controller
public class UploadController {
    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        String originalFilename = file.getOriginalFilename();

        File newFile = new File("e:/upload/" + originalFilename);

        try {
            FileUtils.writeByteArrayToFile(newFile,file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
