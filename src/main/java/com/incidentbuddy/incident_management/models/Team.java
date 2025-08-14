package com.incidentbuddy.incident_management.models;

import java.sql.Date;
import java.util.List;

import com.incidentbuddy.incident_management.models.enums.Department;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String teamCode;

    private Department department;

    private Date createdOn;

    @OneToOne
    @JoinColumn(name = "lead_id")
    private User teamLead;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> teamMembers;
}
