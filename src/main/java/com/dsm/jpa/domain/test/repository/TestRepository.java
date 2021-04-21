package com.dsm.jpa.domain.test.repository;

import com.dsm.jpa.domain.test.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}