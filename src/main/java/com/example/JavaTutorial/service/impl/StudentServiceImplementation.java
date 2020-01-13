package com.example.JavaTutorial.service.impl;


import com.example.JavaTutorial.data.StudentRepository;
import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImplementation implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public Student registerNewStudentAccount(StudentDto studentDto) {
        Student newStudent = new Student();
        newStudent.setUsername(studentDto.getUsername());
        newStudent.setEmail(studentDto.getEmail());
        newStudent.setPassword(studentDto.getPassword());
        studentRepository.save(newStudent);
        return newStudent;
    }
}
