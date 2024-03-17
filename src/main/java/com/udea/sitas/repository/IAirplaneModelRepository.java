package com.udea.sitas.repository;

import com.udea.sitas.model.entities.AirplaneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAirplaneModelRepository extends JpaRepository<AirplaneModel, String> {
}
