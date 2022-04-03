package com.konzerra.ylsp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Briefing {
    @Id
    @GeneratedValue()
    private Long id;
    private Date date;
    private String overview;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "briefing_volunteer",
            joinColumns = @JoinColumn(name = "briefing_id"),
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
