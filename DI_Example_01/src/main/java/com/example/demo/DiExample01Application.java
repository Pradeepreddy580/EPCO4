package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiExample01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DiExample01Application.class, args);
		
		Employee e = context.getBean(Employee.class);
		
		e.printEmployees();
	}

}
