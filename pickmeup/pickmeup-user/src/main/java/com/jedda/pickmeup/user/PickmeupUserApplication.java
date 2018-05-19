package com.jedda.pickmeup.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PickmeupUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickmeupUserApplication.class, args);
	}
}
