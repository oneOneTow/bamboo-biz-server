package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;
import com.luzhiqing.bamboo.service.ExpressOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpressOrderController {

    @Autowired
    private ExpressOrderService expressOrderService;

    /**
     * 下单
     *
     * @param order
     * @return
     */
    @RequestMapping(value = "/v1/express/order", method = RequestMethod.POST)
    public ExpressOrderDTO placeOrder(ExpressOrderDTO order) {
        return expressOrderService.placeOrder(order);
    }
}
