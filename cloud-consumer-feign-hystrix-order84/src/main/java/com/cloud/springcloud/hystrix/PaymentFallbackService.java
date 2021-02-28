package com.cloud.springcloud.hystrix;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * @PackageName: com.cloud.springcloud.hystrix
 * @ClassName: PaymentFallbackService
 * @Description: This is PaymentFallbackService class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-28 20:53
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {
    @Override
    public Result create(Payment payment) {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }

    @Override
    public Result get(Long id) {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
}

    @Override
    public Result port() {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }

    @Override
    public Result timeout() {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }
}
