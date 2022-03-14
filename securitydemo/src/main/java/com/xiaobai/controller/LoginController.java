package com.xiaobai.controller;

import com.xiaobai.entity.User;
import com.xiaobai.service.LoginService;
import com.xiaobai.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 12:54
 * @program security
 * @Version 1.0
 * @ClassName LoginController
 * @Description 类方法说明：$
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        return loginService.login(user);
    }

    @GetMapping("/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }

}
