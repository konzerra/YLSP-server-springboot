package com.konzerra.ylsp.service_impl;

import com.konzerra.ylsp.dto.request_dto.ProjectStatusRequestDto;
import com.konzerra.ylsp.dto.response_dto.ProjectStatusResponseDto;
import com.konzerra.ylsp.model.ProjectStatus;
import com.konzerra.ylsp.service.ProjectStatusService;

import java.util.List;

public class ProjectStatusImpl implements ProjectStatusService {
    @Override
    public ProjectStatus saveProjectStatus(ProjectStatusRequestDto projectStatusRequestDto) {
        return null;
    }

    @Override
    public List<ProjectStatusResponseDto> getAllProjectStatuses() {
        return null;
    }

    @Override
    public ProjectStatusResponseDto getProjectStatusById(Long id) {
        return null;
    }

    @Override
    public ProjectStatusResponseDto updateProjectsStatus(ProjectStatus projectStatus) {
        return null;
    }

    @Override
    public void deleteProjectStatus(Long id) {

    }
}
