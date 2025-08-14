package com.incidentbuddy.incident_management.services;

import java.util.List;

import com.incidentbuddy.incident_management.models.Department;
import com.incidentbuddy.incident_management.payloads.TeamDto;

public interface TeamService {

    public void createTeam(TeamDto teamDto);

    public TeamDto getTeamById(Integer teamId);

    public TeamDto updateTeam(TeamDto teamDto, Integer teamId);

    public void deleteTeam(Integer teamId);

    public void addTeamMember(Integer teamId, String userEmail);

    public void removeTeamMember(Integer teamId, String userEmail);

    public void addTeamLead(Integer teamId, String userEmail);

    public void removeTeamLead(Integer teamId, String userEmail);

    public List<TeamDto> getAllTeams();

    public List<TeamDto> getTeamByDepartment(Department department);
}
