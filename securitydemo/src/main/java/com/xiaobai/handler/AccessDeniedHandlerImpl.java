package com.xiaobai.handler;

import com.alibaba.fastjson.JSON;
import com.xiaobai.utils.ResponseResult;
import com.xiaobai.utils.WebUntils;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 15:47
 * @program security
 * @Version 1.0
 * @ClassName AccessDeniedHandlerImpl
 * @Description 类方法说明：授权失败
 */
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        // 处理异常
        ResponseResult result = new ResponseResult(HttpStatus.FORBIDDEN.value(), "你的权限不足，请联系管理员");
        String json = JSON.toJSONString(result);
        WebUntils.renderString(response,json);
    }
}
