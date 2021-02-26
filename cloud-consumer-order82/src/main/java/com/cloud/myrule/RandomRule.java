package com.cloud.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName: com.cloud.myrule
 * @ClassName: RandomRule
 * @Description: This is RandomRule class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-26 21:49
 */
@Configuration
public class RandomRule {
    @Bean
    public IRule myRule(){
        return new com.netflix.loadbalancer.RandomRule();
    }
}
