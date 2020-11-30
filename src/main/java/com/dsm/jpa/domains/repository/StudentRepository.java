package com.dsm.jpa.domains.repository;

import com.dsm.jpa.domains.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
