package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: com.cloud.springcloud.OrderMain81
 * @Description: This is com.cloud.springcloud.OrderMain81 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 20:19
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class OrderMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class, args);
        System.out.println("OrderMain81-启动完毕!!!");
    }
}
