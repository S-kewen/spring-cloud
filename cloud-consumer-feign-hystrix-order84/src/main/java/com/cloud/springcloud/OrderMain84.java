package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: com.cloud.springcloud.OrderMain81
 * @Description: This is com.cloud.springcloud.OrderMain81 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 20:19
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class OrderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class, args);
        System.out.println("OrderMain84-启动完毕!!!");
    }
}
