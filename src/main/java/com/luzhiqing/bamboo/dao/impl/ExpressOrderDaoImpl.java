package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.dao.ExpressOrderDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TExpressOrder;

import static com.luzhiqing.bamboo.entity.tables.TExpressOrder.*;

import com.luzhiqing.bamboo.entity.tables.records.TExpressOrderRecord;
import com.luzhiqing.common.cache.Cache;
import com.luzhiqing.common.jooq.AbstractBaseJooqDao;
import com.luzhiqing.common.jooq.BaseJooqDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
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
    @Override
    public TExpressOrder insert(TExpressOrder expressOrder){
        //TODO:清除分页缓存
        return super.insert(expressOrder);
    }


}
