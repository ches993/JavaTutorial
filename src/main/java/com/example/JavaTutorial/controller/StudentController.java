package com.example.JavaTutorial.controller;

import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;


    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@Valid @RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.registerNewStudentAccount(studentDto));
    }

    @GetMapping("/getStudentByName")
    public ResponseEntity<Student> getStudentByName(@RequestParam(value = "username") String username){
        return ResponseEntity.ok(studentService.findStudentByUsername(username));
    }

    @GetMapping("/getAllStudents")
    public  ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/findStudentWhereUsernameStartsFromAorB")
    public ResponseEntity<List<Student>> findStudentWhereUsernameStartsFromAorB(){
        return ResponseEntity.ok(studentService.findStudentWhereUsernameStartsFromAorB());
    }


    @PutMapping ("/addUniversityToStudents")
    public  ResponseEntity<Student> addUniversityToStudents (@RequestParam(value = "username")String username,
                                                             @RequestParam(value = "universityName")String universityName){
        return ResponseEntity.ok(studentService.addUniversityToStudent(username, universityName));
    }
}
