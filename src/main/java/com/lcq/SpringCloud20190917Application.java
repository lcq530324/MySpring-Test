package com.lcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud20190917Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud20190917Application.class, args);
	}

}
