package com.example.JavaTutorial.service.impl;


import com.example.JavaTutorial.data.StudentRepository;
import com.example.JavaTutorial.data.UniversityRepository;
import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.model.University;
import com.example.JavaTutorial.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StudentServiceImplementation implements StudentService {

    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;
    @Override
    public Student registerNewStudentAccount(StudentDto studentDto) {
        Student newStudent = new Student();
        newStudent.setUsername(studentDto.getUsername());
        newStudent.setEmail(studentDto.getEmail());
        newStudent.setPassword(studentDto.getPassword());
        studentRepository.save(newStudent);
        return newStudent;
    }

    @Override
    public Student findStudentByUsername(String username) {
        return studentRepository.findStudentByUsername(username);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findStudentWhereUsernameStartsFromAorB() {
        return studentRepository.findStudentWhereUsernameStartsFromAorB();
    }

    @Override
    public Student addUniversityToStudent(String studentName, String universityName) {
        Student student = studentRepository.findStudentByUsername(studentName);
        University university = universityRepository.findUniversityByUniversityName(universityName);
        Set<University> set = new HashSet<>();
        set.add(university);
        student.setUniversities(set);
        studentRepository.save(student);
        return student;
    }


}
