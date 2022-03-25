package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class PlaygroundServerOpenFeign8765Application {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundServerOpenFeign8765Application.class, args);
    }

}
