package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsApiApplication.class, args);
		System.out.println("full stack project");
	}

}
