package com.konzerra.ylsp.service;

import com.konzerra.ylsp.model.Volunteer;

import java.util.List;

public interface VolunteerService {
    Volunteer saveVolunteer(Volunteer volunteer);
    List<Volunteer> getAllVolunteers();
    Volunteer getVolunteerById(long id);
}
