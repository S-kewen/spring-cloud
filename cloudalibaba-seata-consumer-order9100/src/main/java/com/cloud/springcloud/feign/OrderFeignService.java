package com.cloud.springcloud.feign;

import com.cloud.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.feign
 * @ClassName: OrderFeignService
 * @Description: This is OrderFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 22:38
 */
@Component
@FeignClient(value = "cloud-seata-service-order")
public interface OrderFeignService {
    @RequestMapping("/order/create")
    Result create(@RequestParam("uid") Long uid, @RequestParam("pid") Long pid, @RequestParam("count") int count, @RequestParam("money") BigDecimal money);
}
