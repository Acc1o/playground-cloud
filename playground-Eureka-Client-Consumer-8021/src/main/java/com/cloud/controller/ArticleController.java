package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/17 9:07
 * @description：
 * @version: 1.0
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    //服务消费者
    @GetMapping("callHello")
    public String callHello2() {
        return restTemplate.getForObject("http://eureka-client-prodocer/user/hello", String.class);
    }
}
