package com.incidentbuddy.incident_management.payloads;

import com.incidentbuddy.incident_management.models.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String contact;
    private String profileImage;
    private Role role;
    private Integer teamLeadingId;
    private Integer teamId;

    // Getters and setters
    // ... (implement as above)
}