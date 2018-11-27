package com.demo.server.microserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microserver1Application.class, args);
	}
	
}
