package com.jedda.pickmeup.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PickmeupEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickmeupEurekaserverApplication.class, args);
	}
}
