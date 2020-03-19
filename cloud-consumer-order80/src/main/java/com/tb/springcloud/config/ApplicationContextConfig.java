package com.tb.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 16:43
 */
@Configuration
public class ApplicationContextConfig {

  @Bean
  @LoadBalanced//此注解赋予了RestTemplate负载均衡的能力  轮询的负载
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
