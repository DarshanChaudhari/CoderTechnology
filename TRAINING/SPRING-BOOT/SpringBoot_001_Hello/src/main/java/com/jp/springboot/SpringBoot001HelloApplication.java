package com.jp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jp.springboot")
public class SpringBoot001HelloApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot001HelloApplication.class, args);
		for (String name: context.getBeanDefinitionNames()) {
			System.out.println("=======******"+name);
		}
		
	}

}
