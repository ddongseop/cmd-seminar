package com.example.web;

import com.example.dto.StudentRequestDto;
import com.example.model.Student;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.DemoApplication.students;

@RestController
public class DemoController {

    private final DemoService demoService;

    @Autowired // 생성자 주입
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

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
        return demoService.getOneStudent(index);
    }

    @PostMapping("/students/new")
    public String createStudent(@RequestBody StudentRequestDto request) {

        demoService.createStudent(request); // 수정된 부분

        return "Student 생성이 완료되었습니다.";
    }

}