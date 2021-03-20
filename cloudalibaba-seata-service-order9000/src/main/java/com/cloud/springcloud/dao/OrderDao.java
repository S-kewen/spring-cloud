package com.cloud.springcloud.dao;

import com.cloud.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PackageName: com.cloud.springcloud.dao
 * @ClassName: OrderDao
 * @Description: This is OrderDao interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:28
 */
@Mapper
public interface OrderDao {
    int create(Order order);
    int updateOne(Order order);
}
