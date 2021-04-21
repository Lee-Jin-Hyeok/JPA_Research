package com.dsm.jpa.domains.service;

import com.dsm.jpa.domains.domain.School;
import com.dsm.jpa.domains.domain.Student;
import com.dsm.jpa.domains.repository.SchoolRepository;
import com.dsm.jpa.domains.repository.StudentRepository;
import com.dsm.jpa.utils.form.StudentListForm;
import com.dsm.jpa.utils.form.StudentResponseForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JPAService {

    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    @Autowired
    public JPAService(SchoolRepository schoolRepository, StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
    }

    public StudentListForm testService() {
        List<Student> students = studentRepository.findAll();
        List<StudentResponseForm> studentResponseForms = students.stream()
                .map(s -> new StudentResponseForm(s.getName(), s.getSchool().getName(), s.getSchool().getLocation()))
                .collect(Collectors.toList());
        return new StudentListForm(studentResponseForms);
    }

    public void findByName(String name) {
        School school = schoolRepository.findByName(name);
        System.out.println("school.name : " + school.getName());
        System.out.println("school.location : " + school.getLocation());
    }
}
