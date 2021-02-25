package com.cloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: EurekaMain7001
 * @Description: This is EurekaMain7001 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 21:47
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
        System.out.println("EurekaMain7001-启动完毕!!!");
    }
}
