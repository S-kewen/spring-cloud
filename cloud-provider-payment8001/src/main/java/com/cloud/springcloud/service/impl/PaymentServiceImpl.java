package com.cloud.springcloud.service.impl;

import com.cloud.springcloud.dao.PaymentDao;
import com.cloud.springcloud.entity.Payment;
import com.cloud.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName: com.cloud.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Description: This is PaymentServiceImpl class by Skwen.
 * @Author: Skwen
 * @Date: 2021-02-24 22:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao dao;
    @Override
    public int create(Payment payment) {
        return dao.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return dao.getById(id);
    }
}
