package com.cloud.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @PackageName: com.cloud.springcloud
 * @ClassName: PaymentMain8002
 * @Description: This is PaymentMain8002 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8008 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8008.class, args);
        System.out.println("PaymentMain8008-启动完毕!!!");
    }
    //这个bean主要是解决/hystrix.stream视图无法打开的问题；
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
