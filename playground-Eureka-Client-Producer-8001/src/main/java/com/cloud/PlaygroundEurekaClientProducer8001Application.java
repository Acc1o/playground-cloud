package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlaygroundEurekaClientProducer8001Application {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundEurekaClientProducer8001Application.class, args);
    }

}
