package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.controller.request.ExpressOrderRequestVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/weixin")
public class ExpressOrderController {
    @RequestMapping(value = "/v1/order",method = RequestMethod.POST)
    public long addOrder(ExpressOrderRequestVO order){
        return Long.MAX_VALUE;
    }
}
