package com.example.StudentManagementSystem;

import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Sai","Gopal Reddy","psgr@gmail.com");
//		Student student2 = new Student("Joe","Anuram","joelanuram@gmail.com");
//		Student student3 = new Student("lakshman","kumar","lucky@gmail.com");
//		Student student4 = new Student("Sruthi","Kanjari","sruthi@gmail.com");
//		Student student5 = new Student("Durga","Prasad","dp@gmail.com");
//
//		studentRepository.saveAll(List.of(student1,student2,student3,student4,student5));
	}
}
