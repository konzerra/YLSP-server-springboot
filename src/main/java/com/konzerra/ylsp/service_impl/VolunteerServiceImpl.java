package com.konzerra.ylsp.service_impl;

import com.konzerra.ylsp.model.Volunteer;
import com.konzerra.ylsp.repository.VolunteerRepository;
import com.konzerra.ylsp.service.VolunteerService;
import org.springframework.stereotype.Service;

@Service
public class VolunteerServiceImpl implements VolunteerService {
    private VolunteerRepository volunteerRepository;

    public VolunteerServiceImpl(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    @Override
    public Volunteer saveVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }
}
