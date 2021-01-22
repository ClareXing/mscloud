package com.xinghl.springcloud.service.impl;

import com.xinghl.springcloud.dao.PaymentDao;
import com.xinghl.springcloud.entities.Payment;
import com.xinghl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
