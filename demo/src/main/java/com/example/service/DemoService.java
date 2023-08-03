package com.example.service;

import com.example.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static com.example.DemoApplication.students;

@Service
public class DemoService {

    public Student getOneStudent(int index) {
        if (index >= students.size()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return students.get(index);
    }
}
