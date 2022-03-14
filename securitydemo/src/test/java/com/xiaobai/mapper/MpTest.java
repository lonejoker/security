package com.xiaobai.mapper;

import com.xiaobai.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testPassword(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encode = passwordEncoder.encode("12");
        String encode1 = passwordEncoder.encode("12");
        System.out.println(encode);
        System.out.println(encode1);
        // 校验
        boolean matches = passwordEncoder.matches("12", "$2a$10$tz2sVtWQb9rYBPcg4id1.e1O8mhQFQEBHexNtJxaOkHE45Ze/BuEG");
        System.out.println(matches);
    }

    @Test
    public void testUser() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
