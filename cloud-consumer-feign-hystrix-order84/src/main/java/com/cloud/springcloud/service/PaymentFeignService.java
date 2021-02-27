package com.cloud.springcloud.service;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @PackageName: com.cloud.springcloud.service
 * @ClassName: PaymentFeignService
 * @Description: This is PaymentFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-27 20:12
 */
@Component
@FeignClient(value = "cloud-payment-service-consul-hystrix")
@RequestMapping("/v1/api/pay")
public interface PaymentFeignService {
    @PostMapping("create")
    public Result create(@RequestBody Payment payment);
    @GetMapping("get/{id}")
    public Result get(@PathVariable("id") Long id);
    @RequestMapping("port")
    public Result port();
    @RequestMapping("timeout")
    public Result timeout();
}
