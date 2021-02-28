package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: com.cloud.springcloud.GatewayMain9527
 * @Description: This is com.cloud.springcloud.GatewayMain9527 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-28 22:40
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GatewayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class, args);
        System.out.println("GatewayMain9527-启动完毕!!!");
    }
}
