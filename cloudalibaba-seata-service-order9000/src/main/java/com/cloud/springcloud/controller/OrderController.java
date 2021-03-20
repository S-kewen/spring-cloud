package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Order;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:54
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("create")
    public Result create(Long uid, Long pid, int count, BigDecimal money) {
        Order order = new Order();
        order.setUser_id(uid);
        order.setProduct_id(pid);
        order.setCount(count);
        //商品数量
        order.setMoney(money);
        order.setStatus(0);
        if (orderService.create(order) > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK, order.getId());
        }
        return new Result(StatusCode.INSERTFAIL, StatusMsg.INSERTFAIL);
    }
}
