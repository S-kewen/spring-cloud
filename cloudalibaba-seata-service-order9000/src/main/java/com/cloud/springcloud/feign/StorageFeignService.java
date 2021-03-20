package com.cloud.springcloud.feign;

import com.cloud.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageName: com.cloud.springcloud.feign
 * @ClassName: StorageFeignService
 * @Description: This is StorageFeignService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 22:39
 */
@Component
@FeignClient(value = "cloud-seata-service-storage")
public interface StorageFeignService {
    @RequestMapping("/storage/decrease")
    Result decrease(@RequestParam("id") Long id, @RequestParam("count") int count);
}
