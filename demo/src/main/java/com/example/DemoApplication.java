package com.example;

import com.example.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		students.add(new Student("전은지", "2022312132"));
		students.add(new Student("구래건", "2022123123"));

		SpringApplication.run(DemoApplication.class, args);
	}
}
