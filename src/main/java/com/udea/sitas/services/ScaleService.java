package com.udea.sitas.services;

import com.udea.sitas.model.entities.AirplaneModel;
import com.udea.sitas.model.entities.Airport;
import com.udea.sitas.model.entities.Scale;
import com.udea.sitas.repository.IAirplaneModelRepository;
import com.udea.sitas.repository.IAirportRepository;
import com.udea.sitas.repository.IScaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScaleService {
    @Autowired
    private IScaleRepository scaleRepository;

    @Autowired
    private IAirplaneModelRepository airplaneModelRepository;

    @Autowired
    private IAirportRepository airportRepository;

    public Scale saveScale(Scale scale) {
        Airport originRes = airportRepository.findByIATA(scale.getOriginAirport().getId());
        Airport destinationRes = airportRepository.findByIATA(scale.getDestinationAirport().getId());
        AirplaneModel airplaneModelRes = airplaneModelRepository.findById(scale.getAirplaneModel().getId()).get();

        scale.setOriginAirport(originRes);
        scale.setDestinationAirport(destinationRes);
        scale.setAirplaneModel(airplaneModelRes);

        scaleRepository.save(scale);

        return scale;
    }
}
