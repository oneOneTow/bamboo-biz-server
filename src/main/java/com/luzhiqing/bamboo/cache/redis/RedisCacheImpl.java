package com.luzhiqing.bamboo.cache.redis;

import com.luzhiqing.bamboo.cache.AbstractCacheImpl;
import com.luzhiqing.bamboo.dao.Callback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


import java.util.List;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/8/30 19:37
 */
public class RedisCacheImpl extends AbstractCacheImpl {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public <T> T getCache(Callback<T> callback) {
        String cacheKey = this.getCacheKey();
        String appCacheKey = getAppId()+cacheKey;
        long expireTime = this.getExpireTime();
        T data = (T)redisTemplate.opsForValue().get(appCacheKey);
        if(null == data){
            data = callback.ececute();
        }
        redisTemplate.opsForValue().set(appCacheKey,data,expireTime);
        return data;
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
