package com.xinghl.springcloud.service;

import com.xinghl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

public interface PaymentService {



    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}

