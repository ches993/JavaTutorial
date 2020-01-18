package com.example.JavaTutorial.service;

import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;

import java.util.List;

public interface StudentService {

    Student registerNewStudentAccount(StudentDto studentDto);
    Student findStudentByUsername(String username);
    List<Student>  getAllStudent ();
    List<Student>findStudentWhereUsernameStartsFromAorB();


    Student addUniversityToStudent (String studentName , String universityName) ;

}
