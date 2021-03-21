package com.cloud.springcloud;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: OrderMain9000
 * @Description: This is OrderMain9000 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 20:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoDataSourceProxy
public class OrderMain9000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain9000.class, args);
        System.out.println("OrderMain9000-启动完毕!!!");
    }
}
