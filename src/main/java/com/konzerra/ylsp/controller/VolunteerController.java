package com.konzerra.ylsp.controller;

import com.konzerra.ylsp.model.Volunteer;
import com.konzerra.ylsp.service.VolunteerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
