package com.konzerra.ylsp.repository;

import com.konzerra.ylsp.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}