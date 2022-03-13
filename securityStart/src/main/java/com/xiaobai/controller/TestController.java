package com.xiaobai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 22:01
 * @program security
 * @Version 1.0
 * @ClassName TestController
 * @Description 类方法说明：$
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Security";
    }
}
