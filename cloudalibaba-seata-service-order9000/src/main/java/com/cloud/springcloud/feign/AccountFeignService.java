package com.cloud.springcloud.feign;

import com.cloud.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.feign
 * @ClassName: AccountFeignService
 * @Description: This is AccountFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 22:39
 */
@Component
@FeignClient(value = "cloud-seata-service-account")
public interface AccountFeignService {
    @RequestMapping("/account/pay")
    Result pay(@RequestParam("uid") Long uid, @RequestParam("money") BigDecimal money);
}
