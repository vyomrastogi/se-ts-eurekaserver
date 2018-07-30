package com.vyom.troubleshoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoEurekaServerApplication.class, args);
	}
}
