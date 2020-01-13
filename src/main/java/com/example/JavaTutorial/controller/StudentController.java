package com.example.JavaTutorial.controller;

import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;


    @PostMapping("createStudent")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.registerNewStudentAccount(studentDto));
    }
}
