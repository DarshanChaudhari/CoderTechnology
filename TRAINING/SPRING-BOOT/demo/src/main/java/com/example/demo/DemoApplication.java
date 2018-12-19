package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation informs that this is a spring boot application
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// static run method provided by SpringApplication class which accept 2 args 1)Name of the .class file and 2) args passsed through main method
		SpringApplication.run(DemoApplication.class, args);
	}

}

