
package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.Incident;
import lombok.Data;

import java.sql.Date;
@Data
public class CommentDto {
    private Integer id;
    private CommentDto comment;
    private Date commentedOn;
    private Integer commentorId;
    private IncidentDto incident;

}
