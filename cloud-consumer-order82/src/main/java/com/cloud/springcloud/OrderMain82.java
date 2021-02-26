package com.cloud.springcloud;

import com.cloud.myrule.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: com.cloud.springcloud.OrderMain81
 * @Description: This is com.cloud.springcloud.OrderMain81 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 20:19
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@RibbonClient(name="cloud-payment-service-consul",configuration = RandomRule.class)
public class OrderMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class, args);
        System.out.println("OrderMain82-启动完毕!!!");
    }
}
