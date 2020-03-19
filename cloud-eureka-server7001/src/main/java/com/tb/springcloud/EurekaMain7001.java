package com.tb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/10 10:19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class, args);
  }
}
