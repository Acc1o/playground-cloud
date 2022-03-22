package com.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：THEFU
 * @date ：Created in 2022/3/22 11:44
 * @description：日志配置
 * @version: 1.0
 */
@Configuration
public class OpenFeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
