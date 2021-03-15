package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: OrderMain85
 * @Description: This is OrderMain85 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-15 19:32
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class OrderMain85 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain85.class, args);
        System.out.println("OrderMain85-启动完毕!!!");
    }
}
