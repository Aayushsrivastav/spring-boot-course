package com.example.demo1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository)
    {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    "John",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );

            studentRepository.saveAll(
                    List.of(john, alex)
            );
        };
    }
}
