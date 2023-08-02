package com.hlfc.order.controller;

import com.hlfc.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: hxl
 * @Date: 2023/7/11 17:23
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add(){
        stockFeignService.reduct();
        return "Hello world";
    }
}
