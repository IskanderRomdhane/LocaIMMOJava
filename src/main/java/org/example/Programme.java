package org.example;

import org.example.Entites.*;

public class Programme {
    public static void main(String[] args) {

        // Création du propriétaire
        Proprietaire proprietaire = new Proprietaire("P001", "Dupont");

        // Création du logement
        Logement logement = new Logement(
                "12 rue des Lilas",
                proprietaire,
                85.0,
                3,
                1,
                2,
                true,
                750.0,
                500.0
        );

        // Création du compte et de l’agent de ménage
        Compte compteAgent = new Compte("alice01", "1234");
        AgentMenage agent = new AgentMenage("A001", "Alice", "Martin", "5 avenue de France", compteAgent);

        // Tentative sans connexion
        System.out.println("Tentative sans connexion :");
        agent.signalerDegradation("Fuite d’eau dans la salle de bain", 250.0, logement);

        // Connexion de l’agent
        System.out.println("\nConnexion de l’agent :");
        compteAgent.seConnecter("alice01", "1234");

        // Signalement d’une dégradation
        System.out.println("\nSignalement d’une dégradation :");
        Degradation d1 = agent.signalerDegradation("Fuite d’eau dans la salle de bain", 250.0, logement);

        // Confirmation de la réparation
        System.out.println("\nConfirmation de la réparation :");
        proprietaire.confirmerReparation(logement, d1);

        // Déconnexion de l’agent
        System.out.println("\nDéconnexion de l’agent :");
        compteAgent.seDeconnecter();

        // Statut final du logement
        System.out.println("\nStatut final du logement :");
        System.out.println("Adresse : " + logement.getAdresse());
        System.out.println("Statut : " + logement.getStatut());
    }
}
