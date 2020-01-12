package com.example.JavaTutorial.service;

import com.example.JavaTutorial.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudenService {

    Student getStudentByName(String studentName);
    void createUser(String name, String age);
}
