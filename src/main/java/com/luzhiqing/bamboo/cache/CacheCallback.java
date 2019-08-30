package com.luzhiqing.bamboo.cache;

import com.luzhiqing.bamboo.dao.Callback;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/8/30 19:43
 */
public abstract class CacheCallback<T> implements Callback<T> {
    /**
     * 缓存key
     */
    private String cacheKey;
    /**
     * 过期时间
     */
    private long expireTime;

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
}
