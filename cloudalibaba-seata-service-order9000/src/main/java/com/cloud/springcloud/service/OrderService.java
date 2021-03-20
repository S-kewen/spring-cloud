package com.cloud.springcloud.service;

import com.cloud.springcloud.entity.Order;

/**
 * @PackageName: com.cloud.springcloud.service
 * @ClassName: OrderService
 * @Description: This is OrderService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:35
 */
public interface OrderService {
    int create(Order order);
    int updateOne(Order order);
}
