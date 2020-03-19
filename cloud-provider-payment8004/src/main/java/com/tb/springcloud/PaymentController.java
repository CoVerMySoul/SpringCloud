package com.tb.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/16 15:27
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @GetMapping(value = "/payment/zk")
  public String paymentZK(){
    return "springcloud with zookeeper："+serverPort;
  }
}