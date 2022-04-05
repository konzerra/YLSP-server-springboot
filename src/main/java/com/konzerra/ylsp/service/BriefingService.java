package com.konzerra.ylsp.service;

import com.konzerra.ylsp.dto.request_dto.BriefingRequestDto;
import com.konzerra.ylsp.dto.request_dto.DepartmentRequestDto;
import com.konzerra.ylsp.dto.response_dto.BriefingResponseDto;
import com.konzerra.ylsp.dto.response_dto.DepartmentResponseDto;
import com.konzerra.ylsp.model.Briefing;
import com.konzerra.ylsp.model.Department;

import java.util.List;

public interface BriefingService {
    Department saveBriefing(BriefingRequestDto briefingRequestDto);
    List<BriefingResponseDto> getAllBriefings();
    BriefingResponseDto getBriefingById(Long id);
    BriefingResponseDto updateBriefing(Long id, BriefingRequestDto briefingRequestDto);
    void deleteBriefing(Long id);
}
