package com.demo.server.microserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microserver2Application.class, args);
	}
}
