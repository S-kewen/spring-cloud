package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

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

    @RequestMapping("create")
    public Result create(Payment payment) {
        return paymentFeignService.create(payment);
    }

    @RequestMapping("getPayment/{id}")
    public Result getPayment(@PathVariable("id") Long id) {
        return paymentFeignService.get(id);
    }

    @RequestMapping("port")
    public Result port() {
        return paymentFeignService.port();
    }
    @RequestMapping("timeout")
    public Result timeout() {
        return paymentFeignService.timeout();
    }
}
