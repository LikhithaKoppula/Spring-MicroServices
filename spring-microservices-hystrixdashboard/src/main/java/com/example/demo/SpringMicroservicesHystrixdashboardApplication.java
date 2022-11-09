package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableHystrix
@EnableHystrixDashboard
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient

public class SpringMicroservicesHystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesHystrixdashboardApplication.class, args);
	}

}
