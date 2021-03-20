package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: StorageMain9001
 * @Description: This is StorageMain9001 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-20 21:50
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StorageMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(StorageMain9001.class, args);
        System.out.println("StorageMain9001-启动完毕!!!");
    }
}
