package com.example.StudentJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class StudentJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentJpaApplication.class, args);
	}

	@Autowired
	AddressRepository addressRepository;
	@Autowired
	StudentRepository studentRepository;

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student piotr = new Student("Piotr", "Kwiatkowski", "piotr@gmail.com", 2);
			Address addresPiotr = new Address("Paderewskiego");
			piotr.setAddress(addresPiotr);
			addresPiotr.setStudent(piotr);
			studentRepository.save(piotr);


		};
	}
}
