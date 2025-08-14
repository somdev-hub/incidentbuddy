package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.enums.Department;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
public class TeamDto {
    private Integer id;
    private String teamCode;
    private Department department;
    private Date createdOn;
    private Integer teamLeadId;
    private List<Integer> teamMemberIds;

    // Getters and setters
    // ... (implement as above)
}