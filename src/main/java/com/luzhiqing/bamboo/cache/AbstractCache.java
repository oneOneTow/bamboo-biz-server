package com.luzhiqing.bamboo.cache;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/8/30 19:33
 */
public abstract class AbstractCache<T> implements Cache {
    protected Object cache;
    protected String appId;

    protected String getAppId(){
        return "bamboo";
    }
}
