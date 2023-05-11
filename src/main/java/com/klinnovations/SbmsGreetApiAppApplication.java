package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class SbmsGreetApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsGreetApiAppApplication.class, args);
	}

}
