package com.konzerra.ylsp.service;

import com.konzerra.ylsp.dto.request_dto.VolunteerRequestDto;
import com.konzerra.ylsp.model.Volunteer;

import java.util.List;


public interface VolunteerService {
    Volunteer saveVolunteer(VolunteerRequestDto volunteer);
    List<Volunteer> getAllVolunteers();
    Volunteer getVolunteerById(long id);
    Volunteer updateVolunteer(Volunteer volunteer);
    void deleteVolunteer(long id);
}
