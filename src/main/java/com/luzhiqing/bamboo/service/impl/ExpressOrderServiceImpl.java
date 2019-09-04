package com.luzhiqing.bamboo.service.impl;


import com.luzhiqing.bamboo.dao.ExpressOrderDao;
import com.luzhiqing.bamboo.entity.tables.pojos.TExpressOrder;
import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;
import com.luzhiqing.bamboo.service.ExpressOrderService;

import com.luzhiqing.common.util.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;


public class ExpressOrderServiceImpl implements ExpressOrderService {

    @Autowired
    private ExpressOrderDao expressOrderDao;

    @Override
    public ExpressOrderDTO placeOrder(ExpressOrderDTO orderDTO) {
        TExpressOrder expressOder = BeanUtil.map(orderDTO,TExpressOrder.class);
        expressOder = expressOrderDao.insert(expressOder);
        return BeanUtil.map(expressOder,ExpressOrderDTO.class);
    }

}
