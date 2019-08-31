package com.luzhiqing.bamboo.controller.request;


import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import lombok.Data;

import java.util.Date;

@Data
public class ExpressOrderDTO {

    private String expressNumber;
    private ExpressCompanyType expressCompany;
    private Date accessDay;
    private String accessNumber;
    private String phone;
    private String address;
    private String student_name;
    private String remark;
    private OrderType orderType;

}
