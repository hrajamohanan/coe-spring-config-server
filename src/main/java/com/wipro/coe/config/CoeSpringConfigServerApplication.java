package com.wipro.coe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CoeSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoeSpringConfigServerApplication.class, args);
	}
}
