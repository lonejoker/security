package com.xiaobai.mapper;

import com.xiaobai.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 23:45
 * @program security
 * @Version 1.0
 * @ClassName MpTest
 * @Description 类方法说明：$
 */
@SpringBootTest
public class MpTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUser() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
