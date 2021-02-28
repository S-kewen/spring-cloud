package com.cloud.springcloud.controller;

import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.result.Result;
import com.cloud.springcloud.result.StatusCode;
import com.cloud.springcloud.result.StatusMsg;
import com.cloud.springcloud.service.PaymentFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.cloud.springcloud.controller
 * @ClassName: OrderController
 * @Description: This is OrderController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 20:39
 */
@RestController
@RequestMapping("/v1/api/consumer/order")
//@DefaultProperties(defaultFallback = "globalFallback")//controller全局服务降级设置
public class OrderController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @RequestMapping("create")
    public Result create(Payment payment) {
        return paymentFeignService.create(payment);
    }

    @RequestMapping("getPayment/{id}")
    public Result getPayment(@PathVariable("id") Long id) {
        return paymentFeignService.get(id);
    }

    @RequestMapping("port")
//    @HystrixCommand(commandKey = "testCoreSizeCommand",
//            groupKey = "test-provider",
//            fallbackMethod = "fallback",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    public Result port() {
        return paymentFeignService.port();
    }

    @RequestMapping("timeout")
//    @HystrixCommand(commandKey = "testCoreSizeCommand",
//            groupKey = "test-provider",
//            fallbackMethod = "fallback",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
//    @HystrixCommand
    public Result timeout() {
        return paymentFeignService.timeout();
    }

    public Result fallback() {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }

    public Result globalFallback() {
        return new Result(StatusCode.FALLBACK, StatusMsg.FALLBACK);
    }


    //服务熔断

    @RequestMapping("breakTest")
    @HystrixCommand(
            fallbackMethod = "hystrixBreak",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启熔断器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期，休息时间
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后拉闸
            })
    public Result breakTest(int id) {
        if (id > 0) {
            return new Result(StatusCode.OK, StatusMsg.OK);
        }
        throw new UnsupportedOperationException();
    }

    public Result hystrixBreak(int id) {
        //熔断方法需要跟原方法一样的参数
        return new Result(StatusCode.BREAK, StatusMsg.BREAK);
    }
}
