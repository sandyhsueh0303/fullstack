package com.example.demo_fullstack.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController

public class StudentController {
    @RequestMapping("/")
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Sandy",
                        "sandy@gmail.com",
                        Gender.FEMALE
                ),
                new Student(
                        1L,
                        "Max",
                        "max@gmail.com",
                        Gender.MALE
                )
        );
        return students;
    }
}
