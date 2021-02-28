package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.PaymentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: PaymentController
 * @Description: This is PaymentController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:17
 */
@RestController
@RequestMapping("/v1/api/pay")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;
    @Resource
    private DiscoveryClient discoveryClient;
    @PostMapping("create")
    public Result create(@RequestBody Payment payment) {
        int count = paymentService.create(payment);
        if (count > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK);
        } else {
            return new Result(StatusCode.INSERTFAIL, StatusMsg.INSERTFAIL);
        }
    }

    @GetMapping("get/{id}")
    public Result get(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new Result(StatusCode.OK, StatusMsg.OK, payment);
        } else {
            return new Result(StatusCode.SELECTFAIL, StatusMsg.SELECTFAIL);
        }
    }

    @RequestMapping("listPayment/{uid}")
    public Result listPayment(@RequestParam(required = false, defaultValue = "1") int pageNumber,@RequestParam(required = false, defaultValue = "10000") int pageSize, @PathVariable("uid") Long uid) {
        Payment payment = new Payment();
        payment.setUid(uid);
        PageHelper.startPage(pageNumber, pageSize);
        List<Map<String, Object>> select = paymentService.getList(payment);
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(select);
        return new Result(StatusCode.OK, StatusMsg.OK, pageInfo);
    }

    @RequestMapping("discovery")
    public Result discovery() {
        //http://localhost:8002/v1/api/pay/discovery
        //服务发现
        return new Result(StatusCode.OK, StatusMsg.OK, discoveryClient);
    }

    @RequestMapping("port")
    public Result port() {
        return new Result(StatusCode.OK, StatusMsg.OK, port);
    }

    @RequestMapping("timeout")
    public Result timeout() {
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return new Result(StatusCode.OK, StatusMsg.OK, port);
    }
}
