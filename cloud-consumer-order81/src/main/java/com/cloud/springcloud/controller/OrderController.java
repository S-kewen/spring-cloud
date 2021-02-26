package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
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
    public static final String PAYMENT_URL = "http://cloud-payment-service-zookeeper/v1/api";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("create")
    public Result create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/pay/create", payment, Result.class);
    }

    @RequestMapping("getPayment/{id}")
    public Result getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/pay/get/" + id, Result.class);
    }

}
