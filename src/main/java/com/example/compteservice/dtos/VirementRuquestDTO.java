package com.example.compteservice.dtos;

import lombok.Data;

@Data
public class VirementRuquestDTO {
    private Long codeSource;
    private Long codeDestination;
    private double montant;

}
