package org.example.Entites;

import org.example.Enum.StatutLogement;
import java.util.ArrayList;
import java.util.List;

public class Logement {
    private String adresse;
    private StatutLogement statut;
    private Proprietaire proprietaire;
    private List<Degradation> degradations;
    private Double surface;
    private int nbChambre;
    private int nbLitDeuxPersonnes;
    private int nbLitUnPersonne;
    private boolean animaux;
    private double tarifBaseHebdomadaire;
    private double montantCaution;

    public Logement(
            String adresse,
            Proprietaire proprietaire,
            Double surface,
            int nbChambre,
            int nbLitDeuxPersonnes,
            int nbLitUnPersonne,
            boolean animaux,
            double tarifBaseHebdomadaire,
            double montantCaution
    ) {
        this.adresse = adresse;
        this.proprietaire = proprietaire;
        this.surface = surface;
        this.nbChambre = nbChambre;
        this.nbLitDeuxPersonnes = nbLitDeuxPersonnes;
        this.nbLitUnPersonne = nbLitUnPersonne;
        this.animaux = animaux;
        this.tarifBaseHebdomadaire = tarifBaseHebdomadaire;
        this.montantCaution = montantCaution;
        this.statut = StatutLogement.LIBRE;
        this.degradations = new ArrayList<>();
    }

    public void ajouterDegradation(Degradation d) {
        degradations.add(d);
        statut = StatutLogement.EN_REPARATION;
        System.out.println("Nouvelle dégradation ajoutée au logement " + adresse);
        proprietaire.notifierDegradation(this, d);
    }

    public void verifierDisponibilite() {
        boolean toutRepare = true;
        for (Degradation d : degradations) {
            if (!d.isRepare()) {
                toutRepare = false;
                break;
            }
        }
        if (toutRepare) {
            statut = StatutLogement.LIBRE;
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public String getStatut() {
        return statut.toString();
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public Double getSurface() {
        return surface;
    }

    public int getNbChambre() {
        return nbChambre;
    }

    public int getNbLitDeuxPersonnes() {
        return nbLitDeuxPersonnes;
    }

    public int getNbLitUnPersonne() {
        return nbLitUnPersonne;
    }

    public boolean isAnimauxAutorises() {
        return animaux;
    }

    public double getTarifBaseHebdomadaire() {
        return tarifBaseHebdomadaire;
    }

    public double getMontantCaution() {
        return montantCaution;
    }

    public List<Degradation> getDegradations() {
        return degradations;
    }
}
