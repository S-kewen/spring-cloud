package com.cloud.springcloud.dao;

import com.cloud.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @PackageName: com.cloud.springcloud.dao
 * @ClassName: PaymentDao
 * @Description: This is PaymentDao interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:05
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getById(@Param("id") Long id);
}
