package com.incidentbuddy.incident_management.payloads;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String contact;
    private String profileImage;
    private String role;
    private Integer teamLeadingId;
    private Integer teamId;

    // Getters and setters
    // ... (implement as above)
}