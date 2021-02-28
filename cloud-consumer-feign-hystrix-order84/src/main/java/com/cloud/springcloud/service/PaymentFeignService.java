package com.cloud.springcloud.service;

import com.cloud.springcloud.config.FeignConfig;
import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.hystrix.PaymentFallbackService;
import com.cloud.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.cloud.springcloud.service
 * @ClassName: PaymentFeignService
 * @Description: This is PaymentFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-27 20:12
 */
@Component
//@RequestMapping("/v1/api/pay")@RequestMapping和@FeignClient会冲突
@FeignClient(value = "cloud-payment-service-consul-hystrix", fallback = PaymentFallbackService.class, configuration = FeignConfig.class)
public interface PaymentFeignService {
    @RequestMapping("/v1/api/pay/create")
    public Result create(@RequestBody Payment payment);

    @RequestMapping("/v1/api/pay/get/{id}")
    public Result get(@PathVariable("id") Long id);

    @RequestMapping("/v1/api/pay/port")
    public Result port();

    @RequestMapping("/v1/api/pay/timeout")
    public Result timeout();
}
