package com.dsm.jpa.domains.service;

import com.dsm.jpa.domains.domain.Student;
import com.dsm.jpa.domains.repository.SchoolRepository;
import com.dsm.jpa.domains.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPAService {

    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public JPAService(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    public void testService() {
        List<Student> students = studentRepository.findAll();
        Student student = students.get(0);
        System.out.println("id : " + student.getId());
        System.out.println("name : " + student.getName());
        System.out.println("school : " + student.getSchool().getName());
    }
}
