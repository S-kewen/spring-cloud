package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8001
 * @Description: This is PaymentMain8001 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 21:53
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        System.out.println("PaymentMain8001-启动完毕!!!");
    }
}
