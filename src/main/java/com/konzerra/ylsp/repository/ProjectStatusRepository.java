package com.konzerra.ylsp.repository;

import com.konzerra.ylsp.model.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectStatusRepository extends JpaRepository<ProjectStatus, Long> {
}