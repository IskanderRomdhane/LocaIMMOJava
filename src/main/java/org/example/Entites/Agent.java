package com.example.locaimmo.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String role;

    @OneToMany(mappedBy = "agentMenage", cascade = CascadeType.ALL)
    private List<Degradation> degradations;
}
