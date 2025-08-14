package com.incidentbuddy.incident_management.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.incidentbuddy.incident_management.exceptions.ResourceNotFoundException;
import com.incidentbuddy.incident_management.models.User;
import com.incidentbuddy.incident_management.payloads.TeamDto;
import com.incidentbuddy.incident_management.payloads.UserDto;
import com.incidentbuddy.incident_management.repositories.UserRepo;
import com.incidentbuddy.incident_management.services.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto getUser(Integer id) {

        return modelMapper.map(userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserDto", "user id", Integer.toString(id))),
                UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto userDto, String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public UserDto getUserByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserByEmail'");
    }

    @Override
    public UserDto getUserById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .toList();
    }

    @Override
    public TeamDto getTeamByUserId(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTeamByUserId'");
    }

}
