package com.xiaobai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 12:53
 * @program security
 * @Version 1.0
 * @ClassName HelloController
 * @Description 类方法说明：$
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
