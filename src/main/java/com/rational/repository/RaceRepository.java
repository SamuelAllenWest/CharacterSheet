package com.rational.repository;

import com.rational.model.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository   extends JpaRepository<Race, Long> {
}
