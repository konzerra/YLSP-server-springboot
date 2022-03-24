package com.konzerra.ylsp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phone;

}
