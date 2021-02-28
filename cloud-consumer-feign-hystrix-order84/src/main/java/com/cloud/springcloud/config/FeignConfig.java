package com.cloud.springcloud.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
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
    Logger.Level feignLoggerLeave() {
        return Logger.Level.FULL;
    }

    public static int connectTimeOutMillis = 1000;
    public static int readTimeOutMillis = 1000;

    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis, true);
    }

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
    //此处可自行配置重试策略
}
