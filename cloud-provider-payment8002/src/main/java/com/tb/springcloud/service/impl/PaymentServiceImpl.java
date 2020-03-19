package com.tb.springcloud.service.impl;

import com.tb.springcloud.dao.PaymentDao;
import com.tb.springcloud.entities.Payment;
import com.tb.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: TanBoQiuYun
 * @Date: 2020/3/9 15:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Autowired
  private PaymentDao paymentDao;

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  @Override
  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
