package com.konzerra.ylsp.dto.request_dto;

import com.konzerra.ylsp.model.Project;
import com.konzerra.ylsp.model.Volunteer;
import com.konzerra.ylsp.model.VolunteerStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
public class VolunteerRequestDto {
    private String name;
    private String email;
    private String phone;
    private Long statusId;
    private Long departmentId;
    private List<Long> projectIds = new ArrayList<>();

    public Volunteer toVolunteer(){
        Volunteer volunteer = new Volunteer();
        volunteer.setName(name);
        volunteer.setEmail(email);
        volunteer.setDepartment(departmentId);

        return
    }
}
