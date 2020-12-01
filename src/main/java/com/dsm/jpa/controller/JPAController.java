package com.dsm.jpa.controller;

import com.dsm.jpa.domains.service.JPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

    private JPAService jpaService;

    @Autowired
    public JPAController(JPAService jpaService) {
        this.jpaService = jpaService;
    }

    @GetMapping("/")
    public void testController() {
        jpaService.testService();
    }
}