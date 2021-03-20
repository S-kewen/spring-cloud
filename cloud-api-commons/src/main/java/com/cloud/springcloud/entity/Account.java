package com.cloud.springcloud.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.entity
 * @ClassName: Account
 * @Description: This is Account class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:57
 */
@Data
public class Account {
    private Long id;
    private Long user_id;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
