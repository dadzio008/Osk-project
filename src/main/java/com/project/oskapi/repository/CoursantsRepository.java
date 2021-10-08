package com.project.oskapi.repository;

import com.project.oskapi.model.Coursants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoursantsRepository extends JpaRepository<Coursants, Long> {
    Optional<Coursants> findCoursantsByUserName(String userName);
}
