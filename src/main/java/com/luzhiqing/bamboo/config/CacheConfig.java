package com.luzhiqing.bamboo.config;

import com.luzhiqing.common.cache.Cache;
import com.luzhiqing.common.cache.redis.RedisCacheImpl;
import org.assertj.core.util.Strings;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class CacheConfig {
    @Bean
    public Cache getCache() {
        Cache cache = new RedisCacheImpl();
        return cache;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }


    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder xStr = new StringBuilder(String.valueOf(x));
        StringBuilder xStrRe = xStr.reverse();
        int xRe = Integer.parseInt(xStrRe.toString());
        List<String> ss = new ArrayList<>();
       String s = String.join("", ss);
        return (x == xRe);
    }
}
