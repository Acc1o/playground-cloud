package com.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/16 15:07
 * @description：
 * @version: 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("hello")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "error")
    public String hello() throws Exception {
       throw new Exception();
//        return "hello，我是生产者8001！！！！";
    }

    public String error(){
        return "error!";
    }


}
