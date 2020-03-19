package com.tb.springcloud.controller;

import com.tb.springcloud.entities.CommonResult;
import com.tb.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 16:20
 */
@RestController
@Slf4j
public class OrderController {

  //单机版
//  public static final String URL = "http://localhost:8001";
//集群版，只关心微服务注册名称，这个微服务名称下面肯定有多个微服务生产者
  public static final String URL = "http://CLOUD-PAYMENT-SERVICE";
  @Resource
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/create")
  public CommonResult<Payment> create(Payment payment){
    return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
  }

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
    return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class);
  }
}
