package com.example.locaimmo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Degradation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double coutReparation;
    private boolean repare;

    @ManyToOne
    private Logement logement;

    @ManyToOne
    private Agent agentMenage;
}
