package com.tb.springcloud.service;

import com.tb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 15:32
 */
public interface PaymentService {
  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
