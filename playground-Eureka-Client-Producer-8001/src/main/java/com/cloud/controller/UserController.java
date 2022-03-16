package com.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/16 15:07
 * @description：
 * @version: 1.0
 */
@Controller
public class UserController {

    @GetMapping("user")
    @ResponseBody
    public String hello(){
        return "hello，我是生产者！！！！";
    }

}
