
package com.incidentbuddy.incident_management.payloads;

import lombok.Data;

import java.sql.Date;
@Data
public class CommentDto {
    private Integer id;
    private String comment;
    private Date commentedOn;
    private Integer commentorId;
    private Integer incidentId;

}
