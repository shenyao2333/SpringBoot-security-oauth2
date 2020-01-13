package com.sy.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sy
 * Date: 2020/1/13 16:25
 * @Description
 */
@RestController("/test1")
public class Test1Controller {

    @GetMapping("/demo1")
    public Object test1(){
        return "test1 正常访问";
    }


}
