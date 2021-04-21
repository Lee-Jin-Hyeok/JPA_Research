package com.dsm.jpa.controller;

import com.dsm.jpa.domains.service.JPAService;
import com.dsm.jpa.utils.form.StudentListForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

    private final JPAService jpaService;

    @Autowired
    public JPAController(JPAService jpaService) {
        this.jpaService = jpaService;
    }

    @GetMapping("/")
    public StudentListForm testController() {
        return jpaService.testService();
    }

    @GetMapping("/name")
    public void findByName() {
        jpaService.findByName("서울대학교");
    }
}