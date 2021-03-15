package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8010
 * @Description: This is PaymentMain8010 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-15 19:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8010 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8010.class, args);
        System.out.println("PaymentMain8010-启动完毕!!!");
    }
}
