package com.konzerra.ylsp.service;

import com.konzerra.ylsp.dto.request_dto.DepartmentRequestDto;
import com.konzerra.ylsp.dto.request_dto.ProjectStatusRequestDto;
import com.konzerra.ylsp.dto.response_dto.DepartmentResponseDto;
import com.konzerra.ylsp.dto.response_dto.ProjectStatusResponseDto;
import com.konzerra.ylsp.model.Department;
import com.konzerra.ylsp.model.ProjectStatus;

import java.util.List;

public interface ProjectStatusService {
    ProjectStatus saveProjectStatus(ProjectStatusRequestDto projectStatusRequestDto);
    List<ProjectStatusResponseDto> getAllProjectStatuses();
    ProjectStatusResponseDto getProjectStatusById(Long id);
    ProjectStatusResponseDto updateProjectsStatus(ProjectStatus projectStatus);
    void deleteProjectStatus(Long id);
}
