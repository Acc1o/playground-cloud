package com.cloud.controller;

import com.cloud.service.PaymentFeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/22 11:26
 * @description：
 * @version: 1.0
 */
@RestController
public class PaymentFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    //消费者接口
    @GetMapping("hello")
    public String hello(){
        return paymentFeignService.hello();
    }
}
