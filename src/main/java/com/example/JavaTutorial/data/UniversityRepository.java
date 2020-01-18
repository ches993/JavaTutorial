package com.example.JavaTutorial.data;

import com.example.JavaTutorial.model.Student;
import com.example.JavaTutorial.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {

    University findUniversityByUniversityName(@Param(value = "universityName")String universityName);



}
