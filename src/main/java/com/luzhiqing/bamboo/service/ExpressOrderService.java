package com.luzhiqing.bamboo.service;

import com.luzhiqing.bamboo.controller.request.ExpressOrderDTO;

public interface ExpressOrderService {
    /**
     * 创建一个当你订单
     *
     * @param orderDTO
     * @return
     */
    long placeOrder(ExpressOrderDTO orderDTO);
}
