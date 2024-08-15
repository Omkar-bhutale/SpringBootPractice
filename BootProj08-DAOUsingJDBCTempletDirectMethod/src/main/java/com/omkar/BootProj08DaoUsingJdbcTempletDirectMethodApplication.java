package com.omkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.omkar.dto.StudentDTO;
import com.omkar.service.StudentServiceImpl;

@SpringBootApplication
public class BootProj08DaoUsingJdbcTempletDirectMethodApplication {

	public static void main(String[] args) {
	  ApplicationContext context =	SpringApplication.run(BootProj08DaoUsingJdbcTempletDirectMethodApplication.class, args);
	  StudentServiceImpl service = context.getBean(StudentServiceImpl.class);
	  StudentDTO dto = service.fetchStudentByNo(5);
	  System.out.println(dto);
	  System.out.println(dto.getClass().getName());
	  
	  
	  service.fetchAllStudentsDTOs().forEach(studentdto->System.out.println(dto));
	  
	  service.fetchStudentsDTOsByName("raj", "John Doe"  , "Charlie Brown").forEach(System.out::println);
	}

}
