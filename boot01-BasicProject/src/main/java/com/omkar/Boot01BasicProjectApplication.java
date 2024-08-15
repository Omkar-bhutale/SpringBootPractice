package com.omkar;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.omkar.comp.WishMessageGenerator;

@SpringBootApplication
public class Boot01BasicProjectApplication {
	static {
		System.out.print("Boot01BasicProjectApplication.class file is loding");
	}
	
	public Boot01BasicProjectApplication() {
		System.out.println("Boot01BasicProjectApplication zero param constructor");
	}

    @Bean
    public LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot01BasicProjectApplication.class, args);
		System.out.println(context.getClass().getName());
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		wmg.greetUser("Omkar");
		
	}

}
