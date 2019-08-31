package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.cache.Cache;
import com.luzhiqing.bamboo.cache.MissCacheCallback;
import com.luzhiqing.bamboo.dao.AbstractBaseJooqDao;
import com.luzhiqing.bamboo.dao.BaseJooqDao;
import com.luzhiqing.bamboo.dao.Callback;
import com.luzhiqing.bamboo.dao.ExpressOrderDao;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpressOrderDaoImpl extends AbstractBaseJooqDao implements ExpressOrderDao {

    @Override
    protected Table getTable() {
        return null;
    }

    @Override
    protected Class getClazz() {
        return null;
    }

    @Autowired
    private Cache cache;
    private final BaseJooqDao expressOrderDao = this;


    public Object findOne1(final Object o) {
        this.cache.setCacheKey("luzhiqing");
        this.cache.setExpireTime(Long.valueOf(10));
        Object data = cache.getCache(() -> {
            return expressOrderDao.select(o);
        });
        return data;
    }
}
