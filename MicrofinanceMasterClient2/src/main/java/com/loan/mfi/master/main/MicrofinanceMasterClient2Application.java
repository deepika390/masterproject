package com.loan.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicrofinanceMasterClient2Application {

	public static void main(String[] args) 
	{
		System.out.println("**********CLIENT2**************");
		SpringApplication.run(MicrofinanceMasterClient2Application.class, args);
	}

}
