package com.example.StudentJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student piotr = new Student("Piotr", "Kwiatkowski", "piotr@gmail.com", 2);
			studentRepository.save(piotr);
		};
	}
}
