package com.konzerra.ylsp.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue()
    private long id;
    private String name;
    private String overview;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "project_volunteer",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "volunteer_id")

    )
    private List<Volunteer> volunteers = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private ProjectStatus status;

    public void addVolunteer(Volunteer volunteer){
        volunteers.add(volunteer);
    }
    public void removeVolunteer(Volunteer volunteer){
        volunteers.remove(volunteer);
    }
}
