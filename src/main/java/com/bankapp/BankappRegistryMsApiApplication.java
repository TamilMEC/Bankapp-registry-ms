package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class BankappRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankappRegistryMsApiApplication.class, args);
	}

}
