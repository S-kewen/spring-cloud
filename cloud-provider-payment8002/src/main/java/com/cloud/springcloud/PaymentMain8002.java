package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8002
 * @Description: This is PaymentMain8002 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:37
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
        System.out.println("PaymentMain8001-启动完毕!!!");
    }
}
