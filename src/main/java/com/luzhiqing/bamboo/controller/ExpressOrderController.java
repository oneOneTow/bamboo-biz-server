package com.luzhiqing.bamboo.controller;

import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;
import com.luzhiqing.bamboo.service.BookInfo;
import com.luzhiqing.bamboo.service.ExpressOrderService;
import com.luzhiqing.bamboo.service.MongoTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExpressOrderController {

    @Autowired
    private ExpressOrderService expressOrderService;
    @Autowired
    private MongoTestService mongoTestService;

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

    @RequestMapping(value = "/mongo",method = RequestMethod.GET)
    public String mongoTest(){
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("luzhiqing");
        bookInfo.setBookDesc("jsdfuisdhfsduihfisudkjksjhdfjkshl;ldskfhiouasmxcvnskdjfhksjlckvclkjsdhfls");
        mongoTestService.insert(bookInfo);
        return "ok";
    }

}
