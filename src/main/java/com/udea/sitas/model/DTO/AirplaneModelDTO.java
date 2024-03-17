package com.udea.sitas.model.DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AirplaneModelDTO {
    @NotEmpty
    private String id;

    private String family;

    private int capacity;

    private long cargoCapacity;
}
