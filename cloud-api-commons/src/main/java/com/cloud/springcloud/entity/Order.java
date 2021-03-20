package com.cloud.springcloud.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.entity
 * @ClassName: Order
 * @Description: This is Order class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:54
 */
@Data
public class Order {
    private Long id;
    private Long user_id;
    private Long product_id;
    private int count;
    private BigDecimal money;
    private int status;
}
