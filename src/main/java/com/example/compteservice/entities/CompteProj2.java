package com.example.compteservice.entities;

import com.example.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="p2",types=Compte.class)
public interface CompteProj2 {
    public double getSolde();
    TypeCompte getType();

}
