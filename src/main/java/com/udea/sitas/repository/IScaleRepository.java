package com.udea.sitas.repository;

import com.udea.sitas.model.entities.Scale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IScaleRepository extends JpaRepository<Scale, Long> {
}
