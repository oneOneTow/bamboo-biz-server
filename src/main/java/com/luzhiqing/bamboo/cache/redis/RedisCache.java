package com.luzhiqing.bamboo.cache.redis;

import com.luzhiqing.bamboo.cache.AbstractCache;
import com.luzhiqing.bamboo.cache.CacheCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


import java.util.List;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/8/30 19:37
 */
public class RedisCache extends AbstractCache {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public <T> T execute(CacheCallback<T> callback) {
        String cacheKey = callback.getCacheKey();
        String appCacheKey = getAppId()+cacheKey;
        long expireTime = callback.getExpireTime();
        T res = callback.ececute();
        redisTemplate.opsForValue().set(appCacheKey,res,expireTime);
        return res;
    }

    @Override
    public boolean abandon(String nameSpace, String key) {
        String appCacheKey = getAppId()+nameSpace+key;
        try{
            redisTemplate.delete(appCacheKey);
        }catch(Throwable t){
            return false;
        }
        return true;
    }

    @Override
    public boolean abandon(String nameSpace, List<String> keys) {
        for(String key : keys){
            String appCacheKey = getAppId()+nameSpace+key;
            try{
                redisTemplate.delete(appCacheKey);
            }catch(Throwable t){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean abandon(String nameSpace) {
        String appCacheKey = getAppId()+nameSpace;
        try{
            redisTemplate.delete(appCacheKey+"*");
        }catch(Throwable t){
            return false;
        }
        return true;
    }
}
