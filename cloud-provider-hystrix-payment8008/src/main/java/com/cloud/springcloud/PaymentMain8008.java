package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8002
 * @Description: This is PaymentMain8002 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8008 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8008.class, args);
        System.out.println("PaymentMain8008-启动完毕!!!");
    }
}
