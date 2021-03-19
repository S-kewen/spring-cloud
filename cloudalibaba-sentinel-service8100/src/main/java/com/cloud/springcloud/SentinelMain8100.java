package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: SentinelMain8100
 * @Description: This is SentinelMain8100 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-19 22:05
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class SentinelMain8100 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain8100.class, args);
        System.out.println("SentinelMain8100-启动完毕!!!");
    }
}
