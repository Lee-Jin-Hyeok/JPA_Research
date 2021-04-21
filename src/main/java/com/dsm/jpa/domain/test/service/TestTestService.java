package com.dsm.jpa.domain.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@Transactional
@RequiredArgsConstructor
public class TestTestService {
    private final TestService testService;

    public void testTestService() {
        System.out.println("transaction name: " + TransactionSynchronizationManager.getCurrentTransactionName());
        testService.testService();
    }
}
