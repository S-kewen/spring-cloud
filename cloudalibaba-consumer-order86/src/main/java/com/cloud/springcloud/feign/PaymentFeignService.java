package com.cloud.springcloud.feign;

import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.sentinel.FallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.cloud.springcloud.feign
 * @ClassName: PaymentFeignService
 * @Description: This is PaymentFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 19:16
 */
@Component
@FeignClient(value = "cloud-sentinel-service", fallback = FallbackService.class)
//@RequestMapping("/sentinel") fallback和@RequestMapping会冲突
public interface PaymentFeignService {
    @RequestMapping("/sentinel/port")
    public Result port();
}
