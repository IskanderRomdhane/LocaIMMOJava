package com.example.locaimmo.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL)
    private List<Logement> logements;
}
