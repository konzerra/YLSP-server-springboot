package com.konzerra.ylsp.service;

import com.konzerra.ylsp.dto.request_dto.DepartmentRequestDto;
import com.konzerra.ylsp.dto.response_dto.DepartmentResponseDto;
import com.konzerra.ylsp.model.Department;
import com.konzerra.ylsp.model.Volunteer;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(DepartmentRequestDto departmentRequestDto);
    List<DepartmentResponseDto> getAllDepartments();
    DepartmentResponseDto getDepartmentById(Long id);
    DepartmentResponseDto updateDepartment(Long id, DepartmentRequestDto departmentRequestDto);
    void deleteDepartment(Long id);
}
