package com.luzhiqing.bamboo.config;

import com.luzhiqing.common.cache.Cache;
import com.luzhiqing.common.cache.redis.RedisCacheImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {
    @Bean
    public Cache getCache(){
        Cache cache = new RedisCacheImpl();
        return cache;
    }
}
