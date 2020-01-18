package com.example.JavaTutorial.controller;


import com.example.JavaTutorial.dto.StudentDto;
import com.example.JavaTutorial.dto.UniversityDto;
import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.model.University;
import com.example.JavaTutorial.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/university")

public class UniversityController {

    private final UniversityService universityService;


    @PostMapping("/createUniversity")
    public ResponseEntity<University> createStudent(@Valid @RequestBody UniversityDto universityDto) {
        return ResponseEntity.ok(universityService.CreatNewUniversity(universityDto));
    }


    @GetMapping("/getUniversityByName")
    public ResponseEntity<University> getUniversityByName(@RequestParam(value = "universityName") String universityName){
        return ResponseEntity.ok(universityService.getUniversityByName(universityName));
}
}
