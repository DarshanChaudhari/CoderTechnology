package com.jp.hr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jp.hr.controllers")
public class SpringBoot002EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot002EmployeeApplication.class, args);
	}

}

