package com.cloud.controller;

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
    public String hello(){
        return "hello，我是生产者8002！！！！";
    }

}
