package com.konzerra.ylsp.controller;

import com.konzerra.ylsp.model.Volunteer;
import com.konzerra.ylsp.service.VolunteerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteer")
public class VolunteerController {
    VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @PostMapping
    public ResponseEntity<Volunteer> saveVolunteer(@RequestBody Volunteer volunteer){
        return new ResponseEntity<Volunteer>(volunteerService.saveVolunteer(volunteer), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Volunteer> getAllVolunteers(){
        return volunteerService.getAllVolunteers();
    }
    @GetMapping("{id}")
    public ResponseEntity<Volunteer> getVolunteerById(@PathVariable("id") long id){
        return new ResponseEntity<>(volunteerService.getVolunteerById(id), HttpStatus.OK);
    }
}
