package com.xiaobai;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 23:49
 * @program security
 * @Version 1.0
 * @ClassName SecurityApplication
 * @Description 类方法说明：$
 */
@SpringBootTest
@MapperScan("com.xiaobai.mapper")
public class SecurityApplication {
    @Test
    void contextLoads() {
    }
}
