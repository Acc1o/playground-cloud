package com.cloud.service;

import com.cloud.service.impl.PaymentFeignServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/22 11:20
 * @description：业务逻辑接口+@FeignClient配置调用producer服务
 * @version: 1.0
 */
@Component
@FeignClient(value = "eureka-client-producer",fallback = PaymentFeignServiceImpl.class)//找 “eureka-client-producer” 微服务地址
public interface PaymentFeignService {

    @GetMapping("/user/hello")
    public String hello();
}
