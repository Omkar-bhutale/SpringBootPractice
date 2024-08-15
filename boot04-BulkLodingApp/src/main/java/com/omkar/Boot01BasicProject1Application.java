package com.omkar;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.omkar.comp.Company;
import com.omkar.comp.Company1;
import com.omkar.comp.Company2;
import com.omkar.comp.Company3;
@SpringBootApplication
public class Boot01BasicProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot01BasicProject1Application.class, args);
		Company company = context.getBean(Company.class);
		System.out.println(company);
		Company1 company1 = context.getBean(Company1.class);
		System.out.println(company1);
		
		Company2 company2 = context.getBean(Company2.class);
		System.out.println(company2);
		
		Company3 company3 = context.getBean(Company3.class);
		System.out.println(company3);
	}

}
