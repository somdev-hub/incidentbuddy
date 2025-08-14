package com.incidentbuddy.incident_management.models;

import java.sql.Date;
import java.util.List;

import com.incidentbuddy.incident_management.models.enums.TaskStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Task {

    private Integer id;

    @ManyToOne
    @JoinColumn(name = "incident_id")
    private Incident incident;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    private User assignee;

    private String description;

    private TaskStatus status;

    private Date createdDate;

    private Date dueDate;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FollowUp> followUps;
}
