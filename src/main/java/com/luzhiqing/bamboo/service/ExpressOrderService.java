package com.luzhiqing.bamboo.service;


import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;

public interface ExpressOrderService {
    /**
     * 下单
     *
     * @param orderDTO
     * @return
     */
    ExpressOrderDTO placeOrder(ExpressOrderDTO orderDTO);
}
