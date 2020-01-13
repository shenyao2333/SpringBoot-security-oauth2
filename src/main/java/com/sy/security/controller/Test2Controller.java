package com.sy.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sy
 * Date: 2020/1/13 16:31
 * @Description
 */
@RestController("/test2")
public class Test2Controller {


    @GetMapping("/demo2")
    public Object test1(){
        return "test2 正常访问";
    }


}
