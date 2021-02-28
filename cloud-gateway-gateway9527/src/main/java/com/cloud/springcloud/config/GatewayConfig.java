package com.cloud.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @PackageName: com.cloud.springcloud.config
 * @ClassName: GatewayConfig
 * @Description: This is GatewayConfig class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-28 23:22
 */
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("url-proxy-2",
                r -> r.path("/v1/api/pay/**").uri("http://localhost:8008")
        ).build();
        return routes.build();
    }
}
