package com.konzerra.ylsp.controller;

import com.konzerra.ylsp.dto.request_dto.VolunteerRequestDto;
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

    //Api Create
    @PostMapping
    public ResponseEntity<Volunteer> saveVolunteer(@RequestBody VolunteerRequestDto volunteer){
        return new ResponseEntity<>(volunteerService.saveVolunteer(volunteer), HttpStatus.CREATED);
    }
    //Api Update
    @PutMapping
    public ResponseEntity<Volunteer> updateVolunteer(@RequestBody Volunteer volunteer){
        return new ResponseEntity<>(volunteerService.updateVolunteer(volunteer), HttpStatus.OK);
    }
    //Api Get All
    @GetMapping
    public List<Volunteer> getAllVolunteers(){
        return volunteerService.getAllVolunteers();
    }

    //Api Get by id
    @GetMapping("{id}")
    public ResponseEntity<Volunteer> getVolunteerById(@PathVariable("id") long id){
        return new ResponseEntity<>(volunteerService.getVolunteerById(id), HttpStatus.OK);
    }

    //Api Delete by Id
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteVolunteer(@PathVariable("id") long id){
        volunteerService.deleteVolunteer(id);
        return new ResponseEntity<>("Successfully", HttpStatus.OK);
    }
}
