package com.incidentbuddy.incident_management.services;

import com.incidentbuddy.incident_management.payloads.CommentDto;

public interface AssignIncident {

    public void assignIncidentToTeam(Integer incidentId, Integer teamId);

    public void reassignIncidentToTeam(Integer incidentId, Integer teamId);

    public CommentDto checkCommentsOfIncident(Integer incidentId);

    public String getIncidentDailySummary(Integer incidentId);

    public String getIncidentWeeklySummary(Integer incidentId);
}
