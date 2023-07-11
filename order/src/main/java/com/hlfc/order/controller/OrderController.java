package com.hlfc.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: hxl
 * @Date: 2023/7/11 17:23
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        return "Hello world";
    }
}
