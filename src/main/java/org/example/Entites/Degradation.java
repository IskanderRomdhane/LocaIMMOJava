package com.example.locaimmo.Entity;

import jakarta.persistence.*;
import lombok.*;

public class Degradation {

    private Long id;

    private String description;
    private double coutReparation;
    private boolean repare;

    private Logement logement;

    private Agent agentMenage;
}
