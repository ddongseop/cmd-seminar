package com.example.web;

import com.example.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static com.example.DemoApplication.students;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{index}")
    public Student getStudent(@PathVariable int index) {
        if (index >= students.size()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return students.get(index);
    }
}