package com.omkar;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.omkar.dao.StudentDAOImpl;
import com.omkar.dto.Student;

@SpringBootApplication
public class Boot01BasicProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot01BasicProject1Application.class, args);
			StudentDAOImpl dao = context.getBean(StudentDAOImpl.class);
			List<Student> stdList = dao.getAllStudents();
			stdList.forEach(System.out::println);
			
	}

}
