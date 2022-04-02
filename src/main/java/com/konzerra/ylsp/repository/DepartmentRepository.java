package com.konzerra.ylsp.repository;

import com.konzerra.ylsp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}