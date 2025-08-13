package com.incidentbuddy.incident_management.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String comment;

    private Date commentedOn;

    @ManyToOne
    @Column(name = "user_id")
    private User commentor;

    @ManyToOne
    @JoinColumn(name = "incident_id")
    private Incident incident;
}
