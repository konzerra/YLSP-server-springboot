package com.konzerra.ylsp.dto.response_dto;

import lombok.Data;

import java.util.List;

@Data
public class VolunteerResponseDto {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String status;
    private String department;
    private List<String> projects;
}
