

package com.incidentbuddy.incident_management.payloads;

import lombok.Data;

import java.sql.Date;
@Data
public class FollowUpDto {
    private Integer id;
    private Date postedOn;
    private Integer taskId;
    private CommentDto comment;

    // Getters and setters
    // ... (implement as above)
}
