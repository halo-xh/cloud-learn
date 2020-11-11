package com.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CloudProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProducerApplication.class, args);
	}

}
