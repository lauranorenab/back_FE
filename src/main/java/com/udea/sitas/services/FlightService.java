package com.udea.sitas.services;

import com.udea.sitas.model.entities.Flight;
import com.udea.sitas.model.entities.Scale;
import com.udea.sitas.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FlightService {

    @Autowired
    private IFlightRepository flightRepository;

    @Autowired
    private ScaleService scaleService;

    public Flight saveFlight(Flight flight) {
        Set<Scale> scales = flight.getScales();
        flightRepository.save(flight);
        for (Scale scale : scales) {
            scale.setFlight(flight);
            scale = scaleService.saveScale(scale);
        }
        flight.setScales(scales);
        return flight;
    }
}
