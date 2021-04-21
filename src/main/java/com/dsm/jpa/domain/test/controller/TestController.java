package com.dsm.jpa.domain.test.controller;

import com.dsm.jpa.domain.test.service.TestTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestTestService testTestService;

    @PostMapping("/test")
    public void testController() {
        testTestService.testTestService();
    }
}
