package com.konzerra.ylsp.model;

import com.konzerra.ylsp.dto.response_dto.DepartmentDto;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String overview;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Volunteer supervisor;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Volunteer> volunteers = new ArrayList<>();

    public DepartmentDto toDepartmentDto(){
        return new DepartmentDto(
                id,
                name,
                overview,
                supervisor,
                volunteers
        );
    }
}
