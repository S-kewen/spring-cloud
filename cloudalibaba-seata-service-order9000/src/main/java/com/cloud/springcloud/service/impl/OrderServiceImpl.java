package com.cloud.springcloud.service.impl;

import com.cloud.springcloud.dao.OrderDao;
import com.cloud.springcloud.entity.Order;
import com.cloud.springcloud.feign.AccountFeignService;
import com.cloud.springcloud.feign.StorageFeignService;
import com.cloud.springcloud.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PackageName: com.cloud.springcloud.service.impl
 * @ClassName: OrderServiceImpl
 * @Description: This is OrderServiceImpl class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:35
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao dao;
    @Resource
    private AccountFeignService accountFeignService;
    @Resource
    private StorageFeignService storageFeignService;

    @Override
    @GlobalTransactional(name = "cloud-seata-service-order-create", rollbackFor = Exception.class)
    //事务发起方 TM
    public int create(Order order) {

        log.info("订单创建...........");
        dao.create(order);
        log.info("订单创建成功.......");
        log.info("减库存.............");
        storageFeignService.decrease(order.getProduct_id(), order.getCount());
        log.info("减库存成功.........");
        log.info("账户扣款...........");
        accountFeignService.pay(order.getUser_id(), order.getMoney());
        log.info("账户扣款成功.......");
        log.info("修改订单状态.......");
        order.setStatus(1);
        dao.updateOne(order);
        log.info("修改订单状态成功...");
        return 1;
    }

    @Override
    public int updateOne(Order order) {
        return dao.updateOne(order);
    }
}
