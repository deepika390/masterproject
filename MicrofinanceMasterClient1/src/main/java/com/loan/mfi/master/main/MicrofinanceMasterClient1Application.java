package com.loan.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicrofinanceMasterClient1Application {

	public static void main(String[] args) {
		System.out.println("*******CLIENT1************");
		SpringApplication.run(MicrofinanceMasterClient1Application.class, args);
	}

}
