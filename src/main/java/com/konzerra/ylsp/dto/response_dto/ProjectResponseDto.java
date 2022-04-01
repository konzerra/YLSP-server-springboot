package com.konzerra.ylsp.dto.response_dto;


import lombok.Data;

import java.util.List;

@Data
public class ProjectResponseDto {
    private long id;
    private String name;
    private String overview;
    private List<String> volunteers;
    private String status;
}
