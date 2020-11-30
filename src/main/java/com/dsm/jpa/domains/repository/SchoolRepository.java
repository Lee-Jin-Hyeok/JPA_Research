package com.dsm.jpa.domains.repository;

import com.dsm.jpa.domains.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
