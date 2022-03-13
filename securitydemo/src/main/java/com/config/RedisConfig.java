package com.config;

import com.utils.FastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author 终于白发始于青丝
 * @create 2022-03-13 下午 23:16
 * @program security
 * @Version 1.0
 * @ClassName RedisConfig
 * @Description 类方法说明：redis配置
 */
@Configuration
public class RedisConfig {
    @Bean
    @SuppressWarnings(value = {"unchecked", "rawtypes"})
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {

        RedisTemplate<Object, Object> template = new RedisTemplate();
        template.setConnectionFactory(connectionFactory);
        FastJsonRedisSerializer serializer = new FastJsonRedisSerializer(Object.class);
        //    使用StringRedisSerializer来写话和反序列化redis的key值
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(serializer);
        //    Hash的key也采用StringRedisSerializer的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(serializer);
        template.afterPropertiesSet();
        return template;
    }
}
