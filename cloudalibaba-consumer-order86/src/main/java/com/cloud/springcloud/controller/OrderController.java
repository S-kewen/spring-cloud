package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.feign.PaymentFeignService;
import com.cloud.springcloud.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 20:39
 */
@RestController
@RequestMapping("/v1/api/consumer/order")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;


    @RequestMapping("port")
    public Result port() {
        return paymentFeignService.port();
    }
}
