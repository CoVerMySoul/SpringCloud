package com.tb.springcloud.controller;

import com.tb.springcloud.entities.CommonResult;
import com.tb.springcloud.entities.Payment;
import com.tb.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 15:38
 */
@RestController
@Slf4j
public class PaymentController {
  @Autowired
  private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @Resource
  private DiscoveryClient discoveryClient;

  @PostMapping(value = "/payment/create")
  public CommonResult create(Payment payment) {
    int i = paymentService.create(payment);
    if (i > 0){
      return new CommonResult(200,"新增成功, serverPort："+serverPort, i);
    }else {
      return new CommonResult(200,"新增失败", null);
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult getPaymentById(@PathVariable("id") Long id) {
    Payment payment = paymentService.getPaymentById(id);
    if (payment != null){
      return new CommonResult(200,"查询成功, serverPort："+serverPort, payment);
    }else {
      return new CommonResult(200,"查询失败", null);
    }
  }

  @GetMapping(value = "/payment/discovery")
  public Object discovery(){
    //Eureka上的所有微服务
    List<String> services = discoveryClient.getServices();
    for (String ele:services) {
      log.info("element:" + ele);
    }
    //具体某一个微服务下面的全部实例信息
    List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
    for (ServiceInstance instance:instances) {
      log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
    }
    return this.discoveryClient;
  }
}
