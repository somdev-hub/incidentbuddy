package com.incidentbuddy.incident_management.services;

import java.util.List;

import com.incidentbuddy.incident_management.payloads.TeamDto;
import com.incidentbuddy.incident_management.payloads.UserDto;

public interface UserService {

    UserDto getUser(Integer id);

    UserDto updateUser(UserDto userDto, String email);

    void deleteUser(Integer id);

    UserDto getUserByEmail(String email);

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    public TeamDto getTeamByUserId(Integer userId);
}
