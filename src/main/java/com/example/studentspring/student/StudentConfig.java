package com.example.studentspring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alp = new Student (
                    "Alp",
                    "alpcan@gmail.com",
                    LocalDate.of(1994, Month.APRIL,4),
                    42
            );

            Student cem = new Student (
                    "Cem",
                    "cem32@gmail.com",
                    LocalDate.of(1900, Month.OCTOBER,6),
                    34
            );

            repository.saveAll(
                    List.of(alp,cem)
            );
        };
    }

}
