package com.project.oskapi.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    com.project.oskapi.model.User findByUsername(String username);
}