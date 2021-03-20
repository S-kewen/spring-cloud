package com.cloud.springcloud.controller;

import com.cloud.springcloud.feign.OrderFeignService;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 22:38
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {
    @Autowired
    private OrderFeignService orderFeignService;

    @RequestMapping("create")
    public Result create(Long uid, Long pid, int count, BigDecimal money) {
        return orderFeignService.create(uid,pid,count,money);
    }
}
