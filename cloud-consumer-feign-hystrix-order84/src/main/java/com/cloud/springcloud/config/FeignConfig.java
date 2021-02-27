package com.cloud.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName: com.cloud.springcloud.config
 * @ClassName: FeignConfig
 * @Description: This is FeignConfig class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-27 20:41
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLeave(){
        return Logger.Level.FULL;
    }
}
