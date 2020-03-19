package com.tb.springcloud.controller;

import com.tb.springcloud.entities.CommonResult;
import com.tb.springcloud.entities.Payment;
import com.tb.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 15:38
 */
@RestController
public class PaymentController {
  @Autowired
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @PostMapping(value = "/payment/create")
  public CommonResult create(Payment payment) {
    int i = paymentService.create(payment);
    if (i > 0){
      return new CommonResult(200,"新增成功，serverPort："+serverPort, i);
    }else {
      return new CommonResult(200,"新增失败", null);
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    Payment payment = paymentService.getPaymentById(id);
    if (payment != null){
      return new CommonResult(200,"查询成功, serverPort："+serverPort, payment);
    }else {
      return new CommonResult(200,"查询失败", null);
    }
  }
}
