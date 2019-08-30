package com.luzhiqing.bamboo.dao.impl;

import com.luzhiqing.bamboo.dao.BaseJooqDao;
import com.luzhiqing.bamboo.dao.Callback;
import com.luzhiqing.bamboo.dao.ExpressOrderDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ExpressOrderDaoImpl implements ExpressOrderDao {
    @Autowired
    BaseJooqDao baseJooqDao;
    private void delete(){
        final String  a = "";
        baseJooqDao.delete("sdfs", new Callback() {
            @Override
            public String ececute() {
                return a;
            }
        });
    }
}
