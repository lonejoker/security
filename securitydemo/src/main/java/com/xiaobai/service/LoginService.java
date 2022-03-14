package com.xiaobai.service;

import com.xiaobai.entity.User;
import com.xiaobai.utils.ResponseResult;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
