package com.example.service;

import com.example.dto.StudentRequestDto;
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

    public void createStudent(StudentRequestDto request) {

        // DTO로부터 받아온 새로 생성할 학생의 이름과 학번
        String studentName = request.getName();
        String studentId = request.getId();

        // 받아온 정보로 새로운 학생을 생성
        Student newStudent = new Student(studentName, studentId);

        // 임시 DB에 해당하는 students에 추가
        students.add(newStudent);
    }
}
