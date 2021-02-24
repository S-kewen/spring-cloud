package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("create")
    public Result create(Payment payment) {
        int count = paymentService.create(payment);
        if (count > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK);
        } else {
            return new Result(StatusCode.INSERTFAIL, StatusMsg.INSERTFAIL);
        }
    }

    @GetMapping("get/{id}")
    public Result getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        if (payment != null) {
            return new Result(StatusCode.OK, StatusMsg.OK,payment);
        } else {
            return new Result(StatusCode.SELECTFAIL, StatusMsg.SELECTFAIL);
        }
    }
}
