package com.cloud.service.impl;

import com.cloud.service.PaymentFeignService;
import org.springframework.stereotype.Service;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/25 9:38
 * @description：
 * @version: 1.0
 */
@Service
public class PaymentFeignServiceImpl implements PaymentFeignService {
    @Override
    public String hello() {
        return "服务提供方不可用，请稍后再试";
    }
}
