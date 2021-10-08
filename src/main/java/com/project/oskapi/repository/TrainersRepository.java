package com.project.oskapi.repository;

import com.project.oskapi.model.Trainers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainersRepository extends JpaRepository<Trainers, Long> {
    Optional<Trainers> findTrainersByUserName(String userName);

}
