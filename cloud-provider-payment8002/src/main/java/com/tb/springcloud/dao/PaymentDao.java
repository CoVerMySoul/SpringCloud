package com.tb.springcloud.dao;

import com.tb.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/8 19:16
 */
@Component
@Mapper
public interface PaymentDao {
  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") Long id);
}
