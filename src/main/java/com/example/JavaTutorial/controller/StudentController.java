package com.example.JavaTutorial.controller;

import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.service.StudenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private final StudenService studenService;

    @GetMapping("/{name}")
   public ResponseEntity<Student> getStudentBBuName(@PathVariable String name){
        try{
           return ResponseEntity.ok(studenService.getStudentByName(name));
        } catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addUser")
    public String createUser(@RequestBody String name, String age){
       studenService.createUser(name, age);
       return "User was created successfully";
    }
}


