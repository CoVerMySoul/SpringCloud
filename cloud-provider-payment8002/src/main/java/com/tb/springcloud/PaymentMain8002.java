package com.tb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * springboot主启动类
 * @Author: TanBoQiuYun
 * @Date: 2020/3/8 17:38
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8002.class, args);
  }
}
