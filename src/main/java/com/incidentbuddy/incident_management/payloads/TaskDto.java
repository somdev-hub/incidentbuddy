
package com.incidentbuddy.incident_management.payloads;

import java.sql.Date;

import com.incidentbuddy.incident_management.models.TaskStatus;

import lombok.Data;

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
