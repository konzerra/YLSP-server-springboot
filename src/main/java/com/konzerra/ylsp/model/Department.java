package com.konzerra.ylsp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String overview;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Volunteer> volunteers = new ArrayList<>();
}
