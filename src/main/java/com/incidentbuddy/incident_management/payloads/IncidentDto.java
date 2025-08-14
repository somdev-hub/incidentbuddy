
package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.enums.Category;
import com.incidentbuddy.incident_management.models.enums.IncidentStatus;
import com.incidentbuddy.incident_management.models.enums.Priority;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
public class IncidentDto {
    private Integer id;
    private String title;
    private String description;
    private Priority priority;
    private IncidentStatus status;
    private Date dateReported;
    private Date dateResolved;
    private Category category;
    private Integer reporterId;
    private Integer assignedToTeamId;
    private Integer managerId;
    private List<String> attachments;

    // Getters and setters
    // ... (implement as above)
}
