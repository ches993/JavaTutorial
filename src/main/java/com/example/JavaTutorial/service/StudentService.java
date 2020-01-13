package com.example.JavaTutorial.service;

import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;

public interface StudentService {

    Student registerNewStudentAccount(StudentDto studentDto);
}
