package com.dsm.jpa.domains.service;

import com.dsm.jpa.domains.domain.School;
import com.dsm.jpa.domains.repository.SchoolRepository;
import com.dsm.jpa.domains.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAService {

    private SchoolRepository schoolRepository;
    private StudentRepository studentRepository;

    @Autowired
    public JPAService(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    public void testService() {
        List<School> schools = schoolRepository.findAll();
        schools.forEach(System.out::println);
    }
}
