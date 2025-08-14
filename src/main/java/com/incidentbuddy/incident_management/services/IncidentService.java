package com.incidentbuddy.incident_management.services;

import java.sql.Date;
import java.util.List;

import com.incidentbuddy.incident_management.models.Category;
import com.incidentbuddy.incident_management.models.IncidentStatus;
import com.incidentbuddy.incident_management.models.Priority;
import com.incidentbuddy.incident_management.payloads.IncidentDto;

public interface IncidentService {

    public void createIncident(IncidentDto incidentDto);

    public IncidentDto getIncidentById(Integer incidentId);

    public void updateIncident(Integer incidentId, IncidentDto incidentDto);

    public void deleteIncident(Integer incidentId);

    public List<IncidentDto> getAllIncidents();

    public List<IncidentDto> getIncidentsByStatus(IncidentStatus status);

    public List<IncidentDto> getIncidentsByAssignee(Integer assigneeId);

    public List<IncidentDto> getIncidentsByReporter(Integer reporterId);

    public List<IncidentDto> getIncidentsByPriority(Priority priority);

    public List<IncidentDto> getIncidentsByCategory(Category category);

    public List<IncidentDto> getIncidentsByTeam(Integer teamId);

    public List<IncidentDto> getIncidentsByDateRange(Date startDate, Date endDate);

    public List<IncidentDto> getIncidentsByKeyword(String keyword);

    public void addIncidentComment(Integer incidentId, String comment);

}
