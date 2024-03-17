package com.udea.sitas.model.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Airplanemodel")
@Data
public class AirplaneModel implements java.io.Serializable {

    @Id
    private String id;

    @Column(name = "family")
    private String family;

    @Column(name = "capacity", precision = 3)
    private int capacity;

    @Column(name = "cargo_capacity", precision = 10, scale = 2)
    private long cargoCapacity;

    @OneToMany(mappedBy = "airplaneModel")
    private Set<Scale> scales = new HashSet<Scale>();
}
