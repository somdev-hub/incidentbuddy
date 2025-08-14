

package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.Incident;
import com.incidentbuddy.incident_management.models.enums.TaskStatus;
import lombok.Data;

import java.sql.Date;
@Data
public class TaskDto {
    private Integer id;
    private Incident incident;
    private Integer assigneeId;
    private String description;
    private TaskStatus status;
    private Date createdDate;
    private Date dueDate;

    // Getters and setters
    // ... (implement as above)
}
