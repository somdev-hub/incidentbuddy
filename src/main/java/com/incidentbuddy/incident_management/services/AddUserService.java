package com.incidentbuddy.incident_management.services;

import com.incidentbuddy.incident_management.payloads.UserDto;

public interface AddUserService {

    public void addUser(UserDto userDto);

    public void deleteUser(String userId);

    public UserDto updateUser(UserDto userDto, String userId);
}
