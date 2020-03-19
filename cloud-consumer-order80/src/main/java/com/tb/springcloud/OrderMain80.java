package com.tb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 16:13
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderMain80.class, args);
  }
}
