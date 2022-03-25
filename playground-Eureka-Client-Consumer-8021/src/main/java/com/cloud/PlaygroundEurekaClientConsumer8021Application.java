package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
public class PlaygroundEurekaClientConsumer8021Application {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundEurekaClientConsumer8021Application.class, args);
	}

}
