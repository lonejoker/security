package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author 终于白发始于青丝
* @create 2022-03-13 下午 23:09
* @program security
* @Version 1.0
* @ClassName SecurityApplication
* @Description 类方法说明：$
*/
@SpringBootApplication
@MapperScan("com.xiaobai.mapper")
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
