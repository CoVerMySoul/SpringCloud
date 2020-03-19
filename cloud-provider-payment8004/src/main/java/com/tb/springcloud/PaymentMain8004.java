package com.tb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/16 15:25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8004 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8004.class, args);
  }
}
