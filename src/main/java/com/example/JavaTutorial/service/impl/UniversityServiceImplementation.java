package com.example.JavaTutorial.service.impl;

import com.example.JavaTutorial.data.UniversityRepository;
import com.example.JavaTutorial.dto.UniversityDto;
import com.example.JavaTutorial.model.University;
import com.example.JavaTutorial.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UniversityServiceImplementation implements UniversityService {

    private final UniversityRepository universityRepository;


    @Override
    public University CreatNewUniversity(UniversityDto universityDto) {
        University neWUniversity = new University();
        neWUniversity.setUniversityAddress(universityDto.getUniversityAddress());
        neWUniversity.setUniversityName(universityDto.getUniversityName());
        universityRepository.save(neWUniversity);

        return neWUniversity;
    }

    @Override
    public University getUniversityByName(String universityName) {
        return universityRepository.findUniversityByUniversityName(universityName);
    }
}

