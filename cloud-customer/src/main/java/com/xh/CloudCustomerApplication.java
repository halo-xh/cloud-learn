package com.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CloudCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCustomerApplication.class, args);
	}

}
