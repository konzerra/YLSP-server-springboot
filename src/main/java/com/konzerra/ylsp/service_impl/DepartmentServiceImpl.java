package com.konzerra.ylsp.service_impl;




import com.konzerra.ylsp.dto.request_dto.DepartmentRequestDto;
import com.konzerra.ylsp.dto.response_dto.DepartmentResponseDto;
import com.konzerra.ylsp.model.Department;
import com.konzerra.ylsp.repository.DepartmentRepository;
import com.konzerra.ylsp.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(
            DepartmentRepository departmentRepository
    ){
        this.departmentRepository = departmentRepository;
    }
    @Override
    public Department saveDepartment(DepartmentRequestDto departmentRequestDto) {

        return null;
    }

    @Override
    public List<DepartmentResponseDto> getAllDepartments() {
        return null;
    }

    @Override
    public DepartmentResponseDto getDepartmentById(Long id) {
        return null;
    }

    @Override
    public DepartmentResponseDto updateDepartment(Department department) {
        return null;
    }

    @Override
    public void deleteDepartment(Long id) {

    }
}
