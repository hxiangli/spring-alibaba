package com.hlfc.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: hxl
 * @Date: 2023/7/26 17:37
 */
@FeignClient(name="stock-server",path = "/stock")
public interface StockFeignService {

    @RequestMapping("/reduct")
    String reduct();
}
