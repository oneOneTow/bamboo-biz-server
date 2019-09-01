package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.cache.Cache;
import com.luzhiqing.bamboo.dao.AbstractBaseJooqDao;
import com.luzhiqing.bamboo.dao.BaseJooqDao;
import com.luzhiqing.bamboo.dao.Callback;
import com.luzhiqing.bamboo.dao.ExpressOrderDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TExpressOrder;

import static com.luzhiqing.bamboo.entity.tables.TExpressOrder.*;

import com.luzhiqing.bamboo.entity.tables.records.TExpressOrderRecord;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpressOrderDaoImpl extends AbstractBaseJooqDao<TExpressOrderRecord, com.luzhiqing.bamboo.entity.tables.TExpressOrder,
        TExpressOrder> implements ExpressOrderDao {

    @Override
    protected com.luzhiqing.bamboo.entity.tables.TExpressOrder getTable() {
        return T_EXPRESS_ORDER;
    }

    @Override
    protected Class<TExpressOrder> getClazz() {
        return TExpressOrder.class;
    }

    @Autowired
    private Cache cache;

    private final BaseJooqDao<TExpressOrder> expressOrderDao = this;

    public TExpressOrder findById(int id) {
        return cache.getCache(() ->
             dsl.selectFrom(table).where(table.ID.eq(id)).fetchOneInto(TExpressOrder.class)
        );
    }


}
