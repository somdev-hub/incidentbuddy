

package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.IncidentStatus;
import com.incidentbuddy.incident_management.models.TaskStatus;
import lombok.Data;

import java.sql.Date;
@Data
public class TaskDto {
    private Integer id;
    private Integer incidentId;
    private Integer assigneeId;
    private String description;
    private TaskStatus status;
    private Date createdDate;
    private Date dueDate;

    // Getters and setters
    // ... (implement as above)
}
