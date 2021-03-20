package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: OrderMain86
 * @Description: This is OrderMain86 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 19:20
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain86 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain86.class, args);
        System.out.println("OrderMain86-启动完毕!!!");
    }
}
