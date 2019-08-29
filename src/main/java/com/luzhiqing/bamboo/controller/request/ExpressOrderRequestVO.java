package com.luzhiqing.bamboo.controller.request;


import com.luzhiqing.bamboo.constants.ExpressCompayType;
import com.luzhiqing.bamboo.constants.OrderType;
import lombok.Data;

import java.util.Date;

@Data
public class ExpressOrderRequestVO {

    private String expressNumber;
    private ExpressCompayType expressCompany;
    private Date accessDay;
    private String accessNumber;
    private String phone;
    private String address;
    private String student_name;
    private String remark;
    private OrderType orderType;

}
