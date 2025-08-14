
package com.incidentbuddy.incident_management.payloads;

import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
public class IncidentDto {
    private Integer id;
    private String title;
    private String description;
    private String priority;
    private String status;
    private Date dateReported;
    private Date dateResolved;
    private String category;
    private Integer reporterId;
    private Integer assignedToTeamId;
    private Integer managerId;
    private List<String> attachments;

    // Getters and setters
    // ... (implement as above)
}
