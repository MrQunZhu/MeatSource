package com.example.demoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableEurekaServer
@EnableHystrix
@EnableHystrixDashboard
public class DemoeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoeurekaApplication.class, args);
	}
}
