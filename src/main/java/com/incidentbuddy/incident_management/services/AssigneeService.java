package com.incidentbuddy.incident_management.services;

import java.util.List;

import com.incidentbuddy.incident_management.models.TaskStatus;
import com.incidentbuddy.incident_management.payloads.IncidentDto;
import com.incidentbuddy.incident_management.payloads.TaskDto;

public interface AssigneeService {
    public List<TaskDto> getAllAssignedTasks(Integer userId);

    public TaskDto getTaskById(Integer taskId);

    public void addTaskFollowUp(Integer taskId, String followUp);

    public void updateTaskStatus(Integer taskId, TaskStatus status);

    public IncidentDto getIncidentByTaskId(Integer taskId);

}
