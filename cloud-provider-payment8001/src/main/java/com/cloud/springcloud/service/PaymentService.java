package com.cloud.springcloud.service;

import com.cloud.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @PackageName: com.cloud.springcloud.service
 * @ClassName: PaymentService
 * @Description: This is PaymentService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:14
 */
public interface PaymentService {
    int create(Payment payment);
    Payment getById(@Param("id") Long id);
}
