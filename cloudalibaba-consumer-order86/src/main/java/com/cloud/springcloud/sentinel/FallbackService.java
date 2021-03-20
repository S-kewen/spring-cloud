package com.cloud.springcloud.sentinel;

import com.cloud.springcloud.feign.PaymentFeignService;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import org.springframework.stereotype.Component;

/**
 * @PackageName: com.cloud.springcloud.sentinel
 * @ClassName: FallbackService
 * @Description: This is FallbackService class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 19:39
 */
@Component
public class FallbackService implements PaymentFeignService {
    @Override
    public Result port() {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }
}
