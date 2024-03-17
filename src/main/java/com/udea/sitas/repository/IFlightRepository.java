package com.udea.sitas.repository;

import com.udea.sitas.model.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {
}