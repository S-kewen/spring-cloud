package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: AccouneMain9002
 * @Description: This is AccouneMain9002 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccouneMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(AccouneMain9002.class, args);
        System.out.println("AccouneMain9002-启动完毕!!!");
    }
}
