package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: EurekaMain7002
 * @Description: This is EurekaMain7002 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 22:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
        System.out.println("EurekaMain7002-启动完毕!!!");
    }
}
