package com.example.JavaTutorial.service.impl;

import com.example.JavaTutorial.model.Student;

import com.example.JavaTutorial.repository.StudentRepository;
import com.example.JavaTutorial.service.StudenService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class StudentServiceImplementation implements StudenService {

    private final StudentRepository studentRepository;

    @Override
    public Student getStudentByName(java.lang.String studentName) {
        return studentRepository.getStudentBUName(studentName);
    }

    @Override
    public void createUser(String name, String age) {
        Student studen = new Student();
        studen.setName(name);
        studen.setAge(age);
        studentRepository.save(studen);
    }
}
