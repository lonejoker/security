package com.xiaobai.service.impl;

import com.xiaobai.entity.LoginUser;
import com.xiaobai.entity.User;
import com.xiaobai.mapper.UserMapper;
import com.xiaobai.service.LoginService;
import com.xiaobai.utils.JwtUtil;
import com.xiaobai.utils.RedisCache;
import com.xiaobai.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 下午 12:56
 * @program security
 * @Version 1.0
 * @ClassName LoginServiceImpl
 * @Description 类方法说明：$
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(User user) {
        // AuthenticationManager authenticationManager进行用户认证
        // 将用户登录的用户名和密码封装成Authentication对象
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        // 让authenticationManager帮助我们进行认证
        // authenticationManage会调用UserDetailsServiceImpl的方法进行校验，封装UserDetails返回
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        // 判断认证是否成功
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("认证失败，登录失败");
        }
        // 因为debugger已经知道是loginuser类型了
        // 认证通过，使用userid生成jwt，并存入ResponseResult返回
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        // 因为jwt所需要的是一个string类型
        String userId = loginUser.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        Map<Object, Object> map = new HashMap<>();
        map.put("token", jwt);
        map.put("user", loginUser.getUser());
        // 将完整的用户信息存入redis，userId作为key
        redisCache.setCacheObject("login:"+userId, loginUser);
        return new ResponseResult(200,"登录成功",map);
    }

    @Override
    public ResponseResult logout() {
        // 获取SecurityContextHolder中的用户id
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        Integer userid = loginUser.getUser().getId();
        // 删除redis的值，拼接key，需要用到用户id
        redisCache.deleteObject("login:" + userid);
        return new ResponseResult(200, "注销成功");
    }
}
