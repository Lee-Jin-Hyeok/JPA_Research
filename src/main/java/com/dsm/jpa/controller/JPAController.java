package com.dsm.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

    @GetMapping("/")
    public void testController() {

    }
}
