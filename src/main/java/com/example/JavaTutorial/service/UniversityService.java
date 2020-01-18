package com.example.JavaTutorial.service;

import com.example.JavaTutorial.dto.UniversityDto;
import com.example.JavaTutorial.model.University;

public interface UniversityService {

    University CreatNewUniversity (UniversityDto universityDto );


    University  getUniversityByName (String universityName);


}
