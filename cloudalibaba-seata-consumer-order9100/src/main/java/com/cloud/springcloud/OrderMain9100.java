package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: OrderMain9100
 * @Description: This is OrderMain9100 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 22:37
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain9100 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9100.class, args);
        System.out.println("OrderMain9100-启动完毕!!!");
    }
}
