package com.incidentbuddy.incident_management.services;

import java.util.List;

import com.incidentbuddy.incident_management.models.TaskStatus;
import com.incidentbuddy.incident_management.payloads.TaskDto;

public interface TaskService {

    public void createTask(Integer incidentId, TaskDto taskDto);

    public void updateTask(Integer taskId, TaskDto taskDto);

    public void deleteTask(Integer taskId);

    public TaskDto getTaskById(Integer taskId);

    public List<TaskDto> getTasksByIncidentId(Integer incidentId);

    public List<TaskDto> getAllTasks();

    public List<TaskDto> getTasksByAssignee(String assigneeEmail);

    public List<TaskDto> getTasksByStatus(TaskStatus status);

    public List<TaskDto> getTasksByKeyword(String keyword);

    public List<TaskDto> getTasksByDateRange(String startDate, String endDate);
}
