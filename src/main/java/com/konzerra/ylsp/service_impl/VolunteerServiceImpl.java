package com.konzerra.ylsp.service_impl;

import com.konzerra.ylsp.exception.ResourceNotFoundException;
import com.konzerra.ylsp.model.Volunteer;
import com.konzerra.ylsp.repository.VolunteerRepository;
import com.konzerra.ylsp.service.VolunteerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerServiceImpl implements VolunteerService {
    private VolunteerRepository volunteerRepository;

    public VolunteerServiceImpl(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    //create volunteer in db
    @Override
    public Volunteer saveVolunteer(Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }

    //get all volunteers
    @Override
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @Override
    public Volunteer getVolunteerById(long id) {
        return volunteerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Volunteer", "Id", id)
        );
    }

    @Override
    public Volunteer updateVolunteer(Volunteer volunteer) {
        Volunteer existingVolunteer = volunteerRepository.findById(volunteer.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Volunteer", "Id", volunteer.getId())
        );
        existingVolunteer.setName(volunteer.getName());
        existingVolunteer.setEmail(volunteer.getEmail());
        existingVolunteer.setPhone(volunteer.getPhone());
        volunteerRepository.save(existingVolunteer);
        return existingVolunteer;
    }

    @Override
    public void deleteVolunteer(long id) {
        volunteerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Volunteer", "Id", id)
        );
        volunteerRepository.deleteById(id);
    }
}
