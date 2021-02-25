package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: OrderMain80
 * @Description: This is OrderMain80 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 20:34
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("OrderMain80-启动完毕!!!");
    }
}
