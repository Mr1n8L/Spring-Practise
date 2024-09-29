package com.spring.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPractiseApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringPractiseApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
