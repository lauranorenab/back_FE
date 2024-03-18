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
@Table(name = "Flight")
@Data
public class Flight implements java.io.Serializable {
    @Id
    @Column(name = "flight_id")
    private long id;

    @Column(name = "flight_number", unique = true)
    private String flightNumber;

    @Column(name = "base_price", nullable = false, precision = 22, scale = 0)
    private double basePrice;

    @Column(name = "tax_percent")
    private double taxPercent;

    @Column(name = "surcharge")
    private double surcharge;

    @OneToMany(mappedBy = "flight")
    private Set<Scale> scales = new HashSet<Scale>();
}
