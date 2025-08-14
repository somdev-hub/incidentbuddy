package com.incidentbuddy.incident_management.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incidentbuddy.incident_management.models.User;
import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    List<User> findAllByTeamId(Integer teamId);

    Optional<User> findById(Integer id);
}
