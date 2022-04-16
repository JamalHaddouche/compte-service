package com.example.compteservice.entities;

import com.example.compteservice.enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor //il ajoute automatiquements les getters et les setters et les constructeurs
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)//dans la base de données l'attribut type est au format string
    private TypeCompte type;
}
