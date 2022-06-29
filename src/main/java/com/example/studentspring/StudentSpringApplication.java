package com.example.studentspring;

import com.example.studentspring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class StudentSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSpringApplication.class, args);
	}


}
