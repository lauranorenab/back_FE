package com.udea.sitas.model.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class FlightDTO {

    @Schema(description = "The flight id auto-generated", example = "1", readOnly = true)
    private long id;

    @NotEmpty()
    @Schema(description = "The flight number in IATA format", required = true, example = "SA1521", pattern = "^[A-Z]{2}[0-9]{3,4}$")
    @Size(min = 5, max = 6, message = "The flight number must be 6 characters.")
    private String flightNumber;

    @NotEmpty()
    @Schema(description = "The base price of the flight", required = true, example = "1000000")
    private double basePrice;

    @NotEmpty()
    @Schema(description = "The tax percent of the flight", required = true, example = "19.0")
    @Min(value = 0, message = "The tax percent must be greater than 0.")
    @Max(value = 100, message = "The tax percent must be less than 100.")
    private double taxPercent;

    @NotEmpty()
    @Schema(description = "The surcharge of the flight", required = true, example = "10.5")
    @Min(value = 0, message = "The surcharge must be greater than 0.")
    @Max(value = 100, message = "The surcharge must be less than 100.")
    private double surcharge;

    @Schema(description = "The scales of the flight, the first scale is the origin and the last scale is the destination", required = true, example = "[{ \"id\": \"1\", \"airplaneModel\": { \"id\": \"A320-200\", \"family\": \"Boeing 737\", \"capacity\": 150, \"cargoCapacity\": 1500 }, \"originAirport\": { \"id\": \"BOG\", \"name\": \"El Dorado\", \"type\": \"International\", \"city\": \"Bogotá\", \"country\": \"Colombia\", \"runways\": 3 }, \"destinationAirport\": { \"id\": \"MDE\", \"name\": \"José María Córdova\", \"type\": \"International\", \"city\": \"Medellín\", \"country\": \"Colombia\", \"runways\": 2 }, \"departureDate\": \"2024-12-30 23:59:59\", \"arrivalDate\": \"2024-12-31 23:59:59\" }]")
    @Size(min = 1, max = 10, message = "The scales must be between 1 and 10 scales.")
    private ScaleDTO[] scales;
}