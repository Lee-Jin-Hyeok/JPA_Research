package com.dsm.jpa.domain.test.service;

import com.dsm.jpa.domain.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public void testService() {
        System.out.println("transaction name: " + TransactionSynchronizationManager.getCurrentTransactionName());
    }
}