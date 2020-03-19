package com.tb.springcloud.controller;

import com.tb.springcloud.entities.CommonResult;
import com.tb.springcloud.entities.Payment;
import com.tb.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/19 15:24
 */
@RestController
@Slf4j
public class OrderFeignController {

  @Autowired
  private PaymentFeignService paymentFeignService;

  @GetMapping(value = "/consumer/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    return paymentFeignService.getPaymentById(id);
  }
}
