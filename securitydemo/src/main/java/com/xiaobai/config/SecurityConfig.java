package com.xiaobai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-14 上午 8:49
 * @program security
 * @Version 1.0
 * @ClassName SecurityConfig
 * @Description 类方法说明：$
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 创建BCryptPasswordEncoder注入容器
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
