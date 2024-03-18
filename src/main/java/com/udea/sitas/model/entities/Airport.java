package com.udea.sitas.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Airport")
@Data
public class Airport {
    @Id
    @Column(name = "airport_code")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "runways")
    private int runways;

    @OneToMany(mappedBy = "originAirport")
    private Set<Scale> originFlights = new HashSet<Scale>();

    @OneToMany(mappedBy = "destinationAirport")
    private Set<Scale> destinationFlights = new HashSet<Scale>();
}