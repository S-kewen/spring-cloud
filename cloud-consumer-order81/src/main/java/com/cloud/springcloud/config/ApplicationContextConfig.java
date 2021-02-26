package com.cloud.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName: com.cloud.springcloud.config
 * @ClassName: ApplicationContextConfig
 * @Description: This is ApplicationContextConfig class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-25 20:42
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //负载均衡注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
