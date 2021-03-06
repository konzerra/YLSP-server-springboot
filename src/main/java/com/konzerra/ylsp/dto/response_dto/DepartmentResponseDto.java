package com.konzerra.ylsp.dto.response_dto;

import com.konzerra.ylsp.model.Volunteer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DepartmentResponseDto {
    private long id;
    private String name;
    private String overview;
    private Volunteer supervisor;
    private List<Volunteer> volunteers = new ArrayList<>();

    public DepartmentResponseDto(long id, String name, String overview, Volunteer supervisor, List<Volunteer> volunteers) {
        this.id = id;
        this.name = name;
        this.overview = overview;
        this.supervisor = supervisor;
        this.volunteers = volunteers;
    }
}
