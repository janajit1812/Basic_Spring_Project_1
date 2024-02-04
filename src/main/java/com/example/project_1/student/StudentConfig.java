package com.example.project_1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student janajit= new Student("Janajit Datta",
                    "dattajanajit@gmail.com",
                    LocalDate.of(2000, DECEMBER,18));
            Student sabarna= new Student("Sabarna Ghosh",
                    "ghoshsabarna@gmail.com",
                    LocalDate.of(2000, JANUARY,23));

            repository.saveAll(
                    List.of(janajit,sabarna)
            );
        };
    }

}
