package com.xiaobai.handler;

import com.alibaba.fastjson.JSON;
import com.xiaobai.utils.ResponseResult;
import com.xiaobai.utils.WebUntils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 15:45
 * @program security
 * @Version 1.0
 * @ClassName AuthenticationEntryPointImpl
 * @Description 类方法说明：认证失败
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        // 处理异常
        ResponseResult result = new ResponseResult(HttpStatus.UNAUTHORIZED.value(), "用户认证失败，请重新登录");
        String json = JSON.toJSONString(result);
        WebUntils.renderString(response,json);
    }
}
