package com.example;

import com.example.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static List<Student> students = List.of(
			new Student("전은지", "2022312132"),
			new Student("구래건", "2022123123")
	);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
