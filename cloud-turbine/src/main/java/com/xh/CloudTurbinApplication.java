package com.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Xiao Hong on 2020-11-12
 */
@EnableTurbine
@SpringBootApplication
public class CloudTurbinApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CloudTurbinApplication.class);
    }
}
