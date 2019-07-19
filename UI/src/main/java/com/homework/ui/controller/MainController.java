package com.homework.ui.controller;

import com.homework.order.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MainController {
    Order order = new Order();
    @RequestMapping("/index")
    public Object getOrder(){
        order.setId(1);
        order.setOrderName("书籍");
        order.setCreateDate(new Date());
        return order;
    }
}
