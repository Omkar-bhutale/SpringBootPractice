package com.omkar;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.omkar.comp.Employee;


@SpringBootApplication
public class Boot01BasicProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot01BasicProject1Application.class, args);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
	}		

}
