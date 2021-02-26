package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8004
 * @Description: This is PaymentMain8004 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 19:59
 */
@SpringBootApplication
@EnableDiscoveryClient
//该注解用于向consul或者zookeeper注册中心进行注册
//zookeeper是临时节点，服务掉线会被清理掉，没有eureka的保护机制
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
        System.out.println("PaymentMain8004-启动完毕!!!");
    }
}
